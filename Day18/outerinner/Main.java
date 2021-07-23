package outerinner;

public class Main {
	public static void main(String[] args) {
		A a=new A();
		//인스턴스 멤버 내부 클래스 객체 생성과정
		A.B b=a.new B();
		b.field1=10;
		b.method1();
		
		//정적멤버 내부클래스 객체 생성과정
		A.C c=new A.C();
		c.field1=3;
		c.method1();
		A.C.field2=30;//정적변수 접근법 c.field2도 되지만 접근속도가 느리다.
		A.C.method2();//정적메소드 접근법
		
		a.method();
	}

}
