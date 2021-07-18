import java.util.ArrayList;
import java.util.List;
public class CollEx09 {
	public static void main(String[] args) {
		List fruit=new ArrayList();
		fruit.add("apple");//Object타입으로 업캐스팅
		fruit.add("grape");
		fruit.add("banana");
		
		String temp;
		for(int i=0;i<fruit.size();i++) {
			temp=(String)fruit.get(i);//object타입을 string타입으로 다운캐스팅
			//toUpperCase를 사용하려면 String클래스로 다운캐스팅 해야한다.
			//Object타입으로 업캐스팅되어져서 저장된 것을 다운캐스팅을 해야하는 불편함이 있다. 
			System.out.println(temp.toUpperCase());
		}
		System.out.println("================================");
		
		List<String> cityName=new ArrayList<>();//뒷부분 <> 제네릭 타입 생략 가능한 것은 jdk 1.7부터 가능하다.
		/*<String>은 java 5버전에서 추가된 컬렉션 제네릭 즉 지네릭스 문법이다.
		 * 문자열 값만 저장할 수 있다. 제네릭 문법이 적용이 되면 자료의 안정성도 보장되고,
		 * 불필요한 캐스팅도 할 필요가 없다. >> 자료 추출이 쉽다.
		 */
		cityName.add("seoul");//문자열 값만 저장할 수 있다.
		cityName.add("busan");
		cityName.add("suwon");
	
		for(String k:cityName) {
			System.out.println(k.toUpperCase());//영문대문자로 바로 바꿀 수 있다. >제네릭 나온 이유
		}
	}
}
