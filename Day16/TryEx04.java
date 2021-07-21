class Member{
	String id="12345678";
	String name="홍길동";
	String phone="010-3530-4324";
}
public class TryEx04 {
	public static void main(String[] args) {
		
		Member m=null;
		try{
			System.out.println("아이디:"+m.id+", 회원명:"+m.name+", 폰번호:"+m.phone);
			//참조변수 m만 선언하고 null만 대입한 상태에서 사용하면 NullPointerException 예외 오류가 발생한다.
		}catch(Exception e) {
			System.out.println("예외 발생:");
			m=new Member();//객체주소가 대입되는 참조변수 m> 객체명(인스턴스)
			System.out.println("아이디:"+m.id+", 회원명:"+m.name+", 폰번호:"+m.phone);		
		}
	}
}
