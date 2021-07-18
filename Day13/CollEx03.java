import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollEx03 {

	public static void main(String[] args) {
		List list=new ArrayList();
		/* java.util 컬렉션 List 인터페이스의 특징>>
		 * 1.하나 이상의 복수개의 원소값을 동시 저장 가능하다. 그리고 복수개의 자료형도 동시저장할 수 있다.
		 * 2.가변적 크기이며, 원소값을 순서있게 저장 가능하다. 중복원소값을 허용한다.
		 */
		list.add(200);
		list.add(100);
		list.add(100.9);
		list.add(50.8);
		list.add("이순신");
		
		Iterator elements=list.iterator();
		/*java.util패키지의 컬렉션 Iterator 인터페이스 특징>>
		 * 1.jdk 1.2에서 추가됨.
		 * 2.컬렉션의 원소값을 쉽게 읽어오기 위한 용도이다.
		 * (Collection(ex:List, ArraryList, LinkedList, Map 등)에서 사용.
		 */
		
		while(elements.hasNext()) {//원소값이 있다면 참. 현재 위치에서 다음에 데이터가 있으면 true 없으면 false
			System.out.println(elements.next());//next()는 다음 데이터를 가져오는 메소드이다.
		}
		
		System.out.println("==================");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
