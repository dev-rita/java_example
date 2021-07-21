import java.io.FileInputStream;
import java.io.IOException;
public class FileEx17 {
	public static void main(String[] args) {
		int data=0;
		String path="./src/FileEx17.java";//파일경로
		
		try {
			FileInputStream fis=new FileInputStream(path);
			//주어진 파일로 부터 바이트 단위로 파일 내용을 읽어오기 위한 fis 생성.
			
			while((data=fis.read())!=-1) {
				System.out.write(data);
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
