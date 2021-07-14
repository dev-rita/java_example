class Member05{
	String id;
	String name;
	String addr;//3개의 멤버변수 초기값은 String 참조타입이어서 null이다.
	
	Member05(){}//기본생성자
	
	Member05(String new_id, String new_name, String addr){
		id=new_id;
		name=new_name;
		addr=addr; //왼쪽 클래스 소속 멤버변수와 오른쪽 생성자 소속 매개변수명이 같으면 값이 대입이 안된다.
		//어느쪽이 클래스 멤버변수 or 생성자 매개변수인지 모르기 때문이다.
	}
	
	void print() {
		System.out.println("아이디:"+id+" 이름:"+name+" 주소:"+addr);
	}
}
public class ConsEx05 {

	public static void main(String[] args) {
		Member05 member=new Member05("kkk","신사임당","서울시");
		member.print();//서울시는 대입이 되지 않는다.
	}

}
