import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoObject21 {
	public static void main(String[] args) {
		Customer cus=new Customer(2,"홍길동",10,130);
		
		try {
			System.out.println(cus.toString());//toString()은 생략 가능
			System.out.println(cus);
			
			FileOutputStream fos=new FileOutputStream("./src/iotest.txt");
			//파일에 바이트 단위로 기록하기 위한 fos 생성
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(cus);//객체 단위로 기록
			
			oos.close();
			fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
