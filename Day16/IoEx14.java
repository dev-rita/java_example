import java.io.OutputStream;

public class IoEx14 {

	public static void main(String[] args) throws Exception {
		int data=0;
		System.out.print("문자입력>>");
		OutputStream myOut=System.out;//System.out은 모니터 출력장치와 연결되고
		//OutputStream은 바이트 출력 스트림의 최상위 추상 클래스이다.
		
		while((data=System.in.read())!=-1) {
			myOut.write((char)data);
		}
	}
}
