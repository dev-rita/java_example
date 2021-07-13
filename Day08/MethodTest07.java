class Member{
	String id="kkkk";
	String name="홍길동";
	String phone="010-123-4567";
}
public class MethodTest07 {

	public static void main(String[] args) {
		Member m=new Member();
		Member t=m;//같은 객체주소. 값을 공유.
		
		System.out.println("아이디:"+m.id+", 이름:"+m.name+", 핸드폰 번호:"+m.phone);
		System.out.println("아이디:"+t.id+", 이름:"+t.name+", 핸드폰 번호:"+t.phone);
		
		t=new Member();//새로운 객체주소 대입. m과 t는 다른 객체주소를 가짐.
		t.id="hello";
		t.name="안녕";
		t.phone="010-8282-8282";
		//m객체로 접근한 값은 t와 다른주소이기 때문에 변경 안됨. 
		
		System.out.println("아이디:"+m.id+", 이름:"+m.name+", 핸드폰 번호:"+m.phone);
		System.out.println("아이디:"+t.id+", 이름:"+t.name+", 핸드폰 번호:"+t.phone);
	}

}
