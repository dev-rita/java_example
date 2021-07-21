import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
public class CopyImage23 {
	public static void main(String[] args) throws IOException {

		Scanner scan=new Scanner(System.in);
		System.out.print("원본 이미지 파일명:./src/mountain.jpg>>");

		String inputFileName=scan.nextLine();

		System.out.print("복사되어질 이미지 파일명:./src/mountain_copy.jpg>>");
		String outputFileName=scan.nextLine();

		try(InputStream inputStream=new FileInputStream(inputFileName); 
				OutputStream outputStream=new FileOutputStream(outputFileName)) {
			//InputStream과 OutputStream은 최상 추상클래스이기 때문에 자손클래스로 객체를 생성할 수 있다.
			/* 자바 7버전(jdk 1.7)이후 부터는 AutoCloseable 인터페이스를 구현 상속한 자손을 try()내에서
			 * 객체를 생성하면 굳이 close()하지 않아도 자동으로 닫히게 된다.
			 */
			int c;
			while((c=inputStream.read())!=-1) {
				outputStream.write(c);//파일에 기록 즉 이미지가 복사되는 것이다.
			}//try
			System.out.println(inputFileName+"을 "+outputFileName+"으로 복사하였습니다.");
		}
	}
}
