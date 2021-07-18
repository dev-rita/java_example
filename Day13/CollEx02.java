import java.util.ArrayList;
import java.util.List;

public class CollEx02 {
	public static void main(String[] args) {
		List list=new ArrayList();//java.util 을 import해야함.
		/* java.util 컬렉션 List 인터페이스의 특징>>
		 * 1.하나 이상의 복수개의 원소값을 동시 저장 가능하다. 그리고 복수개의 자료형도 동시저장할 수 있다.
		 * 2.가변적 크기이며, 원소값을 순서있게 저장 가능하다. 중복원소값을 허용한다.
		 */
		
		list.add("홍길동");//업캐스팅 되면서 원소값이 저장됨.
		list.add("홍길동");
		list.add(100);
		list.add("Hong길동");
		list.add(100.3);
		
		System.out.println("원소 개수:"+list.size());
		
		//일반 for반복문으로 원소값 출력.
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//get()메소드로 원소값을 가져옴.
		}
	}
}
