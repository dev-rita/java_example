import java.util.Arrays;
import java.util.List;

public class GenericEx16 {
	public static void addNumber(List<? super Integer> list) {
		// <? super Integer> 제네릭 와일드 카드는 Integer타입 조상만 제네릭 타입 형변환을 허용한다.(하한선그음.)
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\n===================================");
	}
	public static void main(String[] args) {
		Number[] arr= {10,20,30};
		Object[] arr2= {1,2,3};
		List<Number> li=Arrays.asList(arr);//배열을 컬렉션으로 변환 Number가 Integer타입 조상.
		addNumber(li);
		List<Object> li2=Arrays.asList(arr2);//Object는 Number의 조상.
		addNumber(li2);
		
	}
}
