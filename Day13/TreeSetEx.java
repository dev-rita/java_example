import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set set=new TreeSet();
		
		set.add(11);
		set.add(5);
		set.add(1);
		set.add(9);
		//set.add("홍길동");예외 오류
		System.out.println(set+"\n===================");//출력화면을 보면 저장순서와 관계 없이 오름차순되어 출력.
		
		Set set2=new TreeSet();
		set2.add("홍길동");
		set2.add("김철수");
		set2.add("이순신");
		System.out.println(set2);
	}
}
