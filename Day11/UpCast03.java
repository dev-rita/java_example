class Parent03{
	public void p03() {
		System.out.println("부모클래스 메소드 p03()");
	}
}
class Child03 extends Parent03{
	public void c03() {
		System.out.println("자손클래스 메소드 c03()");
	}
}
public class UpCast03 {

	public static void main(String[] args) {
		Parent03 p=new Parent03();//업캐스팅 안함.
		p.p03();
		Child03 c=(Child03)p;//다운캐스팅 컴파일 에러는 안나지만 실행X. 사전에 업캐스팅을 하지 않아서 캐스팅 연산 예외 오류가 발생한다.
		//자손관계 형변환 x, 형변환을 했던 관계에서만 가능하다.
		c.p03();
		c.c03();
	}

}
