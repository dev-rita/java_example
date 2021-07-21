import java.io.IOException;
import java.io.InputStream;

public class IoEx13 {
	public static void main(String[] args) {
		int data=0;
		
		System.out.print("문자입력>>");
		try {
			InputStream myIn=System.in;//System.in은 키보드 입력장치와 연결
			while((data=myIn.read())!=-1){//read()로 한 바이트씩 읽어들임. 더 이상 읽어들일 값이 없다면 -1
				System.out.write((char)data);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
