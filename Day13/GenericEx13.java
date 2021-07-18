import java.util.Vector;

public class GenericEx13 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("사과");
		v.add("바나나");
		v.add("포도");
		
		Vector<? extends Object> objList;//Vector<Object> objList;는 에러.
		//<? extends T> : 와일드 카드의 상한 제한. T와 그 자손들만 가능
		objList=v;//제네릭 타입간의 형변환은 원래 안됨. >>와일드 카드 사용.
		
		for(Object obj:objList) {
			System.out.println(obj);
		}
	}

}
