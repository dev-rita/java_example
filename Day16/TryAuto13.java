import java.io.PrintWriter;
import java.util.ArrayList;
public class TryAuto13 {
	public static void main(String[] args) throws Exception{//메소드 호출하는곳에서 예외를 떠넘김
		ArrayList<String> cityList=new ArrayList<>();
		//문자열만 저장 가능한 컬렉션 제네릭 생성
		
		cityList.add("seoul");//컬렉션은 가변 배열로 원소값을 추가한다.
		cityList.add("Busan");
		cityList.add("Incheon");

		try(PrintWriter output=new PrintWriter("./src/result.txt")){
			//PrintWriter는 출력스트림으로 화면에 값을 출력하거나 또는 파일에 기록한다.
			for(int i=0;i<cityList.size();i++) {
				output.println(cityList.get(i).toUpperCase());
				//줄바꿈 하면서 영문대문자로 바꿔서 파일에 기록한다.
				//print()메소드는 줄바꿈 하지 않고 기록한다.
				}
			//printWriter 출력스트림 클래스는 java 7에서 추가된 AutoCloseable인터페이스를
			//구현상속을 받았기 때문에 try()내에서 객체를 생성하면 
			//finally문에서 명시적 코드로 close()로 닫지 않아도 자동으로 닫힌다.
		}
	}
}
