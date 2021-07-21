import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IoEx19 {
	public static void main(String[] args) {
		String fileName;
		InputStreamReader myIn=new InputStreamReader(System.in);
		//System.in은 키보드 입력장치와 연결됨. InputStreamReader는 읽어들인 바이트를 문자스트림으로 변환.
		BufferedReader keyBr=new BufferedReader(myIn);
		//BufferedReader는 읽어들인 문자를 임시저장장소에 버퍼링한다.
		try {
			System.out.print("파일이름을 입력>>");
			fileName=keyBr.readLine();
			System.out.println(fileName);
		}catch(IOException ie){
			ie.printStackTrace();
		}finally {
			try{if(keyBr != null) keyBr.close();
			if(myIn != null) myIn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
