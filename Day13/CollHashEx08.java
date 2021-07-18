import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class CollHashEx08 {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		/* java.util패키지의 컬렉션 Map 인터페이스를 구현 상속한(1.2) 클래스 HashTable(1.0) 특징>>
		 * 1. 키, 값 쌍으로 저장
		 * 2. 키를 통해서 값을 검색. >> 검색속도가 빠르다. -사전적 자료구조
		 * 3. 저장된 순서를 보장하지 않는다.
		 */
		
		ht.put("apple", "사과");//최상위 클래스 Object타입으로 업캐스팅 되어져 저장됨.
		ht.put("banana", "바나나");
		ht.put("grape", "포도"); //put()메소드로 키, 값 쌍으로 저장.
		
		String val=(String)ht.get("grape");//다운캐스팅. 키를 통해서 값을 구함. Object>>String
		if(val !=null) {
			System.out.println("grape->"+val);
		}
		System.out.println("========================================");
		Enumeration Enum=ht.keys();//java.util패키지의 Enumeration은 컬렉션에 저장된 원소값을 쉽게 읽어오는 용도로 활용.
		
		while(Enum.hasMoreElements()) {//키요소가 있으면
			Object k=Enum.nextElement();//문자열 키를 구함.
			Object v=ht.get(k);//키에 대한 값을 구함.
			System.out.println(k+":"+v);
		}
		System.out.println("========================================");
		System.out.println(ht);
		System.out.println("========================================");
		Iterator iter=ht.entrySet().iterator();
		while(iter.hasNext()) {//원소값이 있다면 참. 현재 위치에서 다음에 데이터가 있으면 true 없으면 false
			System.out.println(iter.next());//next()는 다음 데이터를 가져오는 메소드이다.
		}
	}
}
