import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class IoCopy25 {
	public static void main(String[] args) throws IOException {
		BufferedReader inputStream=null;//문자로 읽어들인 것을 버퍼링(임시 메모리에 저장)한다.
		PrintWriter outputStream=null;//문자 단위로 기록(출력스트림:웹 개발시 많이 사용)
		
		try {
			inputStream=new BufferedReader(new FileReader("./src/a3.txt"));
			//a3파일은 UTF-8로 저장이 되어있다.
			outputStream=new PrintWriter(new FileWriter("./src/a3_result2.txt"));
			
			String result;
			while((result=inputStream.readLine())!=null) {//한줄 끝까지 문자열로 읽어들임.
				outputStream.println(result);//print(result)면 줄바꿈 하지 않고 기록.
			}
		}finally {
			if(inputStream != null) inputStream.close();
			if(outputStream != null) outputStream.close();
		}		
	}
}
