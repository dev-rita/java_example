import java.util.Enumeration;
import java.util.Vector;
/* add() >>목록의 끝에 지정된 요소를 추가
 * add(index,element) >>지정된 위치에 지정된 요소 삽입
 */
public class CollEx04 {

	public static void main(String[] args) {
		Vector vec=new Vector();
		//벡터 컬렉션도 JDK 1.0에서 추가됨.
		
		for(int i=1;i<=5;i++) {
			vec.add(new Integer(i*10));//원소값이 추가됨 >> 적용된 문법은 오토박싱+업캐스팅
		}//Type safety: The method add(Object) belongs to the raw type Vector. 
		//References to generic type Vector<E> should be parameterized
		vec.add(10);
		Enumeration enu=vec.elements();
		/* java.util 패키지의 Enumeration 컬렉션 인터페이스의 특징>>
		 * 1.jdk 1.0에서 추가됨.
		 * 2.컬렉션에 저장된 원소값을 읽어오기 위한 용도로 활용됨.
		 */
		
		while(enu.hasMoreElements()) {//원소값이 있다면 참.
			System.out.println(enu.nextElement());//원소값을 얻어온다.
		}
		System.out.println("=====================");
		for(int i=0;i<vec.size();i++) {
			System.out.println(vec.get(i)+"");//get()메소드로 원소값을 가져옴.
		}
		
	}
}
