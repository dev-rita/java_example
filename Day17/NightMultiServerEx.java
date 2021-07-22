import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//접속을 계속 유지하고 데이터 송수신 하기 위해서 스레드 클래스 생성
class EchoServerThread implements Runnable{
	Socket child; //클라이언트와 통신하기 위한 소켓
	
	InputStream is;//클라이언트와 연결된 입력 스트림 저장
	ObjectInputStream ois;//클라이언트로부터 데이터를 전송받기 위한 입력 스트림
	
	OutputStream os;//클라이언트와 연결된 출력 스트림 저장
	ObjectOutputStream oos;//클라이언트에게 데이터를 전송하기 위한 출력 스트림
	
	String receiveData; //클라이언트로부터 전송받은 데이터를 저장하기 위한 변수
	//인스턴스 멤버변수 선언
	
	public EchoServerThread(Socket s) {//접속 요청한 소켓 객체가 생성자로 보내진다.
		child=s;//클라이언트와 통신할 수 있는 소켓 정보를 child에 저장함.
		try {
			//접속이 되면 클라이언트로부터 아이피 주소를 얻어 출력함
			System.out.println(child.getInetAddress()+"로 부터 연결 요청을 받음");
			
			is=child.getInputStream();//클라이언트로부터 데이터를 받기위한 입력 스트림
			ois=new ObjectInputStream(is);
			
			os=child.getOutputStream();//클라이언트로부터 받은 메시지를 보내기 위한 출력 스트림
			oos=new ObjectOutputStream(os);
		}catch(IOException e) {e.printStackTrace();}
	}//생성자 종료
	
	@Override
	public void run() {
		try {
			while(true) {
				receiveData=(String)ois.readObject();//클라이언트로부터 데이터를 받아(사용자로부터 받은 메시지를 읽어들임)
				System.out.println(child.getInetAddress()+"의 메시지 : "+receiveData);
				oos.writeObject(receiveData);//다시 클라이언트에게 데이터를 송신함 >>에코
				oos.flush();//출력스트림을 비움
			}
		}catch(Exception e) {
			System.out.println("클라이언트가 강제 종료");
		}
		finally {
			try {
				is.close();
				os.close();
				ois.close();
				oos.close();
				child.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}//run메소드 오버라이딩
}

public class NightMultiServerEx {
	ServerSocket server;//서버상에서 사용자 접속을 기다리기 위해서 필요한 클래스
	static final int PORT=7000;//서버 상의 포트번호
	Socket child;//클라이언트와 통신하기 위한 소켓
	
	public NightMultiServerEx() {//생성자
		try {
			//에코 서버 프로그램은 포트를 지정해서 서버 소켓 생성부터 한다.
			server=new ServerSocket(PORT);
		}catch(Exception e) {//서버 소켓 생성에 실패하면
			e.printStackTrace();//에러 메시지를 출력하고
			System.exit(0);//프로그램을 종료.
		}
		
		System.out.println("****다중 사용자 접속 채팅 서버 ****");
		System.out.println("서버는 클라이언트 소켓의 접속 요청을 기다리고 있음.");
		
		while(true) {
			try {
				//클라이언트의 요청이 없으면 대기 상태에 들어감.
				//클라이언트가 접속하는 순간 클라이언트와 통신할 수 있는 소켓을 반환함
				child=server.accept();//사용자 접속이 이루어지고 서버상의 소켓 객체 생성
				
				//접속을 계속 유지하면서 데이터 송수신 하기 위해서 스레드 객체 생성 **멀티 스레드**
				EchoServerThread childThread=new EchoServerThread(child);
				Thread t=new Thread(childThread);
				t.start();
			}catch(Exception e) {
				e.printStackTrace();//에러 메시지 출력
				System.exit(0);//프로그램 종료
			}
		}//whild문 종료
	}
	public static void main(String[] args) {
		new NightMultiServerEx();//생성자 호출
	}
}//NightMultiServerEx 종료
