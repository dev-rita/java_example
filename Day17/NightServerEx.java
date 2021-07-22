import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NightServerEx {
	
	ServerSocket server=null;//서버 소켓은 서버 상에서 사용자의 접속을 기다리기 위해서 필요한 클래스이다.
	static final int PORT=6000;//서버 포트번호 
	Socket child;//사용자 즉 클라이언트와 통신하기 위한 소켓
	
	InputStream is;//클라이언트와 연결된 입력 스트림 저장
	ObjectInputStream ois; //클라이언트로부터 데이터를 전송받기 위한 스트림 (입력 스트림)
	
	OutputStream os;//클라이언트와 연결된 출력 스트림 저장
	ObjectOutputStream oos;//클라이언트에게 데이터를 전송하기 위한 스트림 (출력 스트림)
	
	String receiveData;//클라이언트로부터 전송받은 데이터를 저장할 변수
	
	public NightServerEx() {
		try {
			//에코 서버 프로그램은 포트를 지정해서 서버 소켓 생성부터 한다.
			server=new ServerSocket(PORT);
			System.out.println("**** 에코 채팅 메아리 서버 ****");
			System.out.println("서버는 항상 클라이언트 소켓의 접속 요청을 기다리고 있음");
			
			//클라이언트의 접속을 항상 받아들일 수 있음. 클라이언트의 요청이 없으면 대기상태에 들어감.
			//클라이언트가 접속하는 순간 클라이언트와 통신할 수 있는 소켓을 반환함.
			child=server.accept();//사용자 접속이 이루어지면 서버상의 소켓 객체가 생성됨.
			
			//접속이 되면 클라이언트로부터 아이피 주소를 얻어 출력함.
			System.out.println(child.getInetAddress()+"로 부터 연결요청 받음");
			
			//클라이언트가 보낸 데이터를 읽기 위해서 클라이언트로부터 입력 스트림을 얻음
			is=child.getInputStream();
			//입력스트림을 ObjectInputStream으로 변환한다.
			ois=new ObjectInputStream(is);
			//클라이언트로부터 받은 메시지를 다시 보내기 위해서 출력 스트림 생성
			os=child.getOutputStream();
			//출력 스트림을 ObjectOutputStream으로 변환한다.
			oos=new ObjectOutputStream(os);
			
			//에코 서버는 스트림을 통해 클라이언트가 보낸 데이터를 서버가 읽어옴.
			while((receiveData=(String)ois.readObject())!=null) {
				if(receiveData.equals("quit")) break;//클라이언트가 quit을 입력하면 접속종료(반복문 종료)
				//클라이언트로부터 받은 데이터를 클라이언트에게 전송함 > 에코:메아리
				oos.writeObject(receiveData);//사용자에게 그대로 다시 전송함.
				oos.flush();//출력스트림 버퍼를 비움.(접속속도가 빨라짐)
			}
		}catch(Exception e){//예외가 발생하면
			e.printStackTrace();//에러메시지 출력 후
			System.exit(0);//프로그램 종료
		}finally {
			try {
				if(is!=null) is.close();
				if(ois !=null)ois.close();
				if(os!=null) os.close();
				if(oos!=null)oos.close();
			}catch(Exception e) {e.printStackTrace();}
		}
	}//생성자
	public static void main(String[] args) {
		new NightServerEx();//생성자 호출
	}
}
