import java.util.Vector;

public class GenericEx14 {

	public static void main(String[] args) {
		Vector<String> vec=new Vector<>();
		
		vec.add("apple");
		vec.add("banana");
		vec.add("orange");
		
		Vector<? extends Object> objList;
		// <? extends Object> 제네릭 와일드 카드는 Object을 상속받은 자손은 제네릭 타입간의 형변환을 허용한다.
		objList=vec;//제네릭 타입간의 업캐스팅 허용
		 
		for(Object obj:objList) {
			System.out.println(obj);
		} 
	}
}
