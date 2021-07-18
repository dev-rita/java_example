import java.util.Enumeration;
import java.util.Hashtable;

public class CollHashEx10 {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<>();//키, 값 쌍으로 문자열만 저장 가능한 컬렉션 제네릭이다.
		//제네릭 타입으로 기본타입은 안되고 반드시 참조 즉 레퍼런스 타입만 가능하다.
		ht.put("banana", "바나나");
		ht.put("apple", "사과");
		ht.put("grape", "포도");
		
		String val=ht.get("banana");//String val=(String)ht.get("grape"); 제네릭 아니면 다운캐스팅 해줘야함.
		if(val !=null) {
			System.out.println("banana->"+val);
		}
		
		Enumeration<String> Enum=ht.keys();
		
		while(Enum.hasMoreElements()) {
			String k=Enum.nextElement();//문자열 키를 구함.
			String v=ht.get(k);//키에 대한 값을 구함.
			System.out.println(k+":"+v);
			System.out.println(k+":"+v);
			//System.out.println(Enum.nextElement()+":"+ht.get(Enum.nextElement())); 가 안되는 이유
			//Enum.nextElement() 키 값이 두번 들어가면 안됨. 키 값이 한번 사용되면 없어지기 때문에 변수로 지정해줌. 
			//Enumeration/iterator/tokenizer는 한번만 사용됨. 다른 객체주소를 새로 만들어야함.
		}
	}
}
