import java.util.ArrayList;
import java.util.ListIterator;

public class CollEx17 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it=list.listIterator();
		/*java.util.의 컬렉션 ListIterator 인터페이스의 특징>>
		 * 1. jdk 1.2에서 추가됨.
		 * 2. Iterator를 상속받아서 기능이 추가되었다. 컬렉션 원소값을 가져올 때 순방향&역방향 즉 양방향으로 모두 값을 가져올 수 있다.
		 * 3. 다만 List를 구현한 자손에서만 사용할 수 있다.
		 */
		
		//순방향으로 진행하면서 읽어옴.
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\n===========================");
		
		//역방향으로 진행하면서 읽어옴.
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
	}
}
