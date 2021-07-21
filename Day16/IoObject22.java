import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class IoObject22 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("./src/iotest.txt");
			//파일로부터 바이트 단위로 읽어오기 위한 fis 생성.
			ObjectInputStream ois=new ObjectInputStream(fis);//객체단위로 읽어오기 위한 ois생성
			Customer cus=(Customer)ois.readObject();//객체단위로 읽어옴
			
			System.out.println("ID \t name \t age \t height");
			System.out.println("======================================>");
			System.out.println(cus);//toString()메소드 생략.
			
			ois.close();
			fis.close();
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
