import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream03 {
	public static void main(String[] args) {
		String[] strArray= {"홍길동","이순신","이율곡"};
		Stream<String> strStream=Arrays.stream(strArray);
		//문자열 배열로부터 스트림 객체를 생성.
		strStream.forEach(s->System.out.print(s+" "));
		
		System.out.println("\n=======================>");
		
		int[] intArray= {1,2,3,4,5};
		IntStream intStream=Arrays.stream(intArray);
		//정수 배열로부터 스트림 객체 생성
		intStream.forEach(score->System.out.print(score+" "));
	}
}
