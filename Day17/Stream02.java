import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream02 {
	public static void main(String[] args) {
		List<Student> list=Arrays.asList(new Student("홍길동",90), new Student("이순신",90));
		
		Stream<Student> stream=list.stream();
		stream.forEach(s->{
			String name=s.getName();//학생명
			int score=s.getScore();//점수
			System.out.println(name+":"+score);
		});
	}
}
