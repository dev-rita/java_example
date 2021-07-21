import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
public class IoEx20 {
	public static void main(String[] args) {		
		String fileName;
		String buf;
		
		Reader myIn=new InputStreamReader(System.in);
		BufferedReader keyBr=new BufferedReader(myIn);
		
		try {
			System.out.print("파일 이름을 입력(./src/IoEx20.java)>>");
			fileName=keyBr.readLine();
			
			FileReader fr=new FileReader(fileName);
			//주어진 파일로 부터 문자단위로 읽어들이기 위한 fr생성.
			BufferedReader fileBr=new BufferedReader(fr);
			//읽어들인 파일내용을 효율적으로 읽어들이기 위해서 버퍼링한다.
			
			while((buf=fileBr.readLine())!= null) {
				//더이상 읽어들일 내용이 없다면 null
				System.out.println(buf);
			}
			fileBr.close();
			fr.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
