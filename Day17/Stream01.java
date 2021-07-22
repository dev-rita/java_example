import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream01 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("홍길동","이순신","강감찬");//배열을 컬렉션 List로 반환
		
		//Iterator
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String name=iterator.next();
			System.out.print(name+" ");
		}
		System.out.println("\n===============================");
		
		//자바 8에서 추가된 스트림과 람다식을 사용
		Stream<String> stream=list.stream();
		stream.forEach(name->System.out.print(name+" "));
	}
}
