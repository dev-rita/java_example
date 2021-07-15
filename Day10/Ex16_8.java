class A{
	public A() {
		//super();
		System.out.println("hello from a");
	}
	
}
class B extends A{
	public B() {
		System.out.println("hello from b");
		//super(); //부모클래스 기본생성자를 호출할 때는 반드시 첫줄에 호출해야 한다.
	}
	
}
public class Ex16_8 {

	public static void main(String[] args) {
		new B();
	}

}
