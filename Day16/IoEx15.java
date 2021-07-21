import java.io.InputStream;
import java.io.OutputStream;
public class IoEx15 {
	public static void main(String[] args) {
		int data=0;
		InputStream myIn=System.in;//InputStream은 바이트 입력스트림의 최상위 추상클래스.
		OutputStream myOut=System.out;
		System.out.print("문자입력>>");
		
		try {
			while((data=myIn.read())!=-1) {
				if(data=='x'||data=='X') {//or이 true면 뒤에 연산 안함. 소문자를 잘쓰기 때문에 'x'를 앞에다 배치.
					System.out.println("입력 종료");
					break; //반복문 중단
				}
				myOut.write(data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
