class GenericClass<T>{//<T>제네릭 타입은 정해지지 않은 가상의 T타입이다.
	private T member;

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
}
public class GenericEx12 {

	public static void main(String[] args) {
		
		GenericClass<Double> g01=new GenericClass<>();//객체생성하면서 T가 Double로 바뀜.
		g01.setMember(10.2);
		System.out.println("반환 실수숫자값:"+g01.getMember());
		
		GenericClass<Integer> g02=new GenericClass<>();
		g02.setMember(50);
		System.out.println("반환 정수숫자값:"+g02.getMember());
		
		GenericClass<String> g03=new GenericClass<>();
		g03.setMember("공기 좋고 조용한곳!");
		System.out.println("반환 문자열값:"+g03.getMember());
	}

}
