class Member02{
	String id;//String 문자열 참조타입 기본값은 null
	String name;//인스턴스변수는 초기화 해주지 않아도 된다. 지역변수는 초기화 해줘야함.
	String phone;
	
	public Member02(){//생성자명은 클래스명과 같다. 리턴타입이 없음.
		id="kkkk";
		name="홍길동";
		phone="010-8838-9888";
	}//생성자의 주된 기능인 멤버변수 초기화이다. (인스턴스 생성시에 실행해야 되는 작업.)

	public void pr() {
		System.out.println("아이디:"+id+" 이름:"+name+" 폰번호:"+phone);
	}//메소드
}
public class ConsEx02 {

	public static void main(String[] args) {
		Member02 m=new Member02();
		m.pr();
		//코드의 재활용성이 더 높다(?)
		new Member02().pr();//활용도는 떨어짐.
	}

}
