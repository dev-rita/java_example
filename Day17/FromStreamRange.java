import java.util.stream.IntStream;

public class FromStreamRange {
	public static int sum;
	public static void main(String[] args) {
		IntStream stream=IntStream.rangeClosed(1, 100);
		//1부터 100까지 순차적으로 제공하는 스트림 객체 생성
		stream.forEach(i-> sum+=i);
		System.out.println("1~100까지의 합 : "+sum);
	}

}
