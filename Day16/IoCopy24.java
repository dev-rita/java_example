import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IoCopy24 {

	public static void main(String[] args) throws IOException{
		FileReader inputStream=null;//파일로부터 문자단위로 읽어들이기 위한 것.
		FileWriter outputStream=null;//파일에 문자단위로 기록하기 위한 것.
		
		try {
			inputStream=new FileReader("./src/a3.txt");
			//a3파일은 UTF-8로 저장이 되어있다.
			outputStream=new FileWriter("./src/a3_result.txt");
			
			int c;
			while((c=inputStream.read())!=-1) {//-1은 더이상 입력 x
				outputStream.write(c);//파일에 기록
			}
		}finally {
			if(inputStream !=null) inputStream.close();
			if(outputStream !=null) outputStream.close();
		}
	}
}
