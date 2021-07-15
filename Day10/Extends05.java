class Parent05{
	void p05() {
		System.out.println("부모클래스 메소드 p05()");
	}
}

class Child05 extends Parent05{
	@Override
	void p05() {
		super.p05();//상속관계에서 부모클래스 메소드 호출.
		System.out.println("오버라이딩 된 메소드");
	}//상속받은 p05 오버라이딩. 상속과 관계 있으며 상속받은 메소드의 내용을 변경.
	
	void ch05() {
		System.out.println("자손클래스에서 정의된 메소드 ch05()");
	}
	
	void ch05(int i) {
		System.out.println("자손클래스에서 오버로딩된 메소드 ch05()"+i);
	}//ch05 오버로딩. 상속과 관계 없으며 기존에 없는 새로운 메소드 정의.
}
public class Extends05 {

	public static void main(String[] args) {
		Child05 ch=new Child05();
		ch.p05();//오버라이딩 메소드	
		ch.ch05();
	}

}
