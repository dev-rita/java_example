import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileEx18 {
	public static void main(String[] args) {
		
		int data;
		System.out.print("파일에 저장할 내용 입력>>");
		
		try {
			//File f=new File("./src/result2.txt");
			//FileOutputStream fos=new FileOutputStream(f);//주어진 파일에 바이트 단위로 기록하기 위한 fos 생성.
			
			FileOutputStream fos=new FileOutputStream("./src/result2.txt");
			while((data=System.in.read())!=-1) {//더이상 읽을 값이 없으면 -1
				fos.write(data);//읽어들인 데이터를 파일에 기록.
			}
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
