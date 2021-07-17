interface MyInterface{
	default void method01() { //public이 생략됨.
		System.out.println("MyInterface in default method01()");
	}
	
	public default void method02() {
		System.out.println("MyInterface in default method02()");
	}//인터페이스에 추상메소드가 추가되면 구현상속한 모든 자손클래스에서 오버라이딩을 해야한다.
	//이러한 불편함을 해결하기 위해서 jdk 1.8에서 디폴트 메소드가 추가됨.
	//추상메소드는 자손메소드에서 강제로 다 오버라이딩 해야되기 때문에 디폴트메소드로 중복된 메소드만 오버라이딩 한다.
	
	static void staticMethod() {//public이 생략됨. static정적메소드도 jdk1.8에서 추가됨.
		System.out.println("MyInterface in staticMethod()");
	}
}//default와 static메소드가 웹개발에서 잘 쓰이지 않는다. 추상메소드가 잘 사용됨.

interface MyInterface2{
	default void method01() {
	//인터페이스간 디폴트 메소드가 중복되는 경우는 인터페이스를 구현 상속한 자손에서 디폴트 메소드를 오버라이딩을 해야한다.
		System.out.println("MyInterface2 in default method01");
	}
	public static void staticMethod() {
		System.out.println("MyInterface2 in staticMethod()");
	}
}

class Parent11{
	public void method02() {
		//인터페이스의 디폴트메소드와 부모클래스의 메소드가 중복되는 경우에는 부모클래스 메소드가 상속되고 디폴트메소드는 무시된다.
		System.out.println("method02() in Parent11");
	}
}

class Child11 extends Parent11 implements MyInterface, MyInterface2{

	@Override
	public void method01() {
		MyInterface.super.method01();
	}//인터페이스간 디폴트 메소드가 중복(method01())되기 때문에 디폴트 메소드를 오버라이딩을 해야한다.
	
}

public class Inter11 {

	public static void main(String[] args) {
		Child11 child=new Child11();
		child.method02();//인터페이스의 디폴트메소드와 부모클래스 메소드가 중복될 시 부모클래스 메소드 호출.
		child.method01();//오버라이딩 된 MyInterface의 디폴트 메소드가 호출됨.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		//추상메소드가 잘사용되기 때문에 추상메소드 개념을 잘 복습하자.
	}

}
