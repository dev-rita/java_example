import java.util.Arrays;
import java.util.List;

class MyList{
	public static void printList(List<?> list) {
		// <?>는 모든 객체 타입 배치가 가능한 제네릭 와일드 카드 문법이다.
		//<? extends Object>와 같은 문장이다.
		 for(Object obj:list) {
			System.out.println(obj+""); 
		 }
		 System.out.println("==================");
	}
}
public class GenericEx15 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(100,200,300);
		//Arrays.asList()는 배열을 컬렉션 List로 변환. Integer가 아닌 int로 하면 에러. 참조타입이어야함.
		MyList.printList(li);
		
		List<String> li2=Arrays.asList("one","two");
		MyList.printList(li2);
	}
}
