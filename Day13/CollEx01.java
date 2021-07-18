import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;


public class CollEx01 {

	public static void main(String[] args) {
		Set set=new HashSet();//업캐스팅

		/* java.util 패키지의 컬렉션 인터페이스 Set의 특징>>
		 * 1. 복수 개의 원소값을 저장할 수 있고, 동시에 여러개의 타입도 동시 저장 가능하다.
		 * 2. 가변적 크기이다.
		 * 3. 원소값을 순서 없이 저장하며, 중복원소값을 허용하지 않는다.
		 */
		
		set.add("홍길동");//값이 저장될 때 자바의 최상위 클래스인 Object타입으로 업캐스팅 하면서 저장됨.
		set.add("홍길동");
		set.add(10);
		set.add(10.3);
		set.add(true);
		set.add("이순신");

		System.out.println("원소 개수:"+set.size());//중복 원소값을 허용하지 않아서 원소개수가 5
		System.out.println(set);

		LinkedHashSet set2= new LinkedHashSet();
		//HashSet 클래스와는 달리, LinkedHashSet은 저장순서가 유지가 됨.

		set2.add("홍길동");
		set2.add("이순신");//String
		set2.add("이순신");
		set2.add(27.5);//double
		set2.add(50);//int

		System.out.println("원소 개수:"+set2.size());//중복 원소값을 허용하지 않아서 원소개수가 4
		System.out.println(set2); //출력 순서도 유지가 됨.
		
		System.out.println("================================");
		Iterator elements=set2.iterator();//Iterator 컬렉션에 저장된 요소에 접근하는데 사용되는 인터페이스
		//iterator()는 Iterator를 구현한 클래스의 인스턴스를 반환
		while(elements.hasNext()) {//원소값이 있다면 참. 현재 위치에서 다음에 데이터가 있으면 true 없으면 false
			System.out.println(elements.next());//next()는 다음 데이터를 가져오는 메소드이다.
		}
	}
} 



