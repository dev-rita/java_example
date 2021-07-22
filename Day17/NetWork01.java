import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWork01 {
	public static void main(String[] args) throws Exception{

		BufferedReader reader;//읽어들인 데이터를 버퍼링한다.(임시 메모리)
		String url=null;//읽어들인 사이트 주소 저장
		InetAddress addr=null;//IP번호를 처리할 때 사용하는 클래스
		
		reader=new BufferedReader(new InputStreamReader(System.in));
		//System.in은 키보드 입력장치와 연결됨. InputStreamReader는 읽어들인 바이트를 문자로 변경함.
		System.out.print("웹사이트 주소 입력>>");
		url=reader.readLine();//한 줄 끝까지 문자열로 읽어들임.
		
		try {
			addr=InetAddress.getByName(url);
		}catch(UnknownHostException ue) {ue.printStackTrace();}
		
		System.out.println("========================================");
		System.out.println(url+"의 ip번호 : "+addr.getHostAddress());
		//사이트 도메인에 대한 ip 주소를 반환
	}

}
