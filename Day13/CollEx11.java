class TestClass11{
	private Object member;

	public Object getMember() {
		return member;
	}

	public void setMember(Object member) {
		this.member = member;
	}
	
}
public class CollEx11 {

	public static void main(String[] args) {
		TestClass11 obj01=new TestClass11();
		obj01.setMember(10);
		//위의 메소드에서 적용된 자바 문법 >> 래퍼클래스로 변환(오토박싱), 업캐스팅
		System.out.println("되돌려진 값:"+obj01.getMember());
		obj01.setMember(10.3);
		System.out.println("되돌려진 실수값:"+obj01.getMember());
		
		obj01.setMember("회원관리");
		System.out.println("되돌려진 문자열 값:"+obj01.getMember());
	}

}
