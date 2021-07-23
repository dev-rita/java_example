package outerinner;

public class A3 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{//A3$B.class로 컴파일
		void method() {
			field1=10;
			method1();
			
			field2=20;
			method2();
		}
	}//인스턴스 멤버 내부 클래스 >외부클래스의 인스턴스 변수와 인스턴스 메소드, 정적변수와 정적메소드 모두 접근 가능하다. 
	
	static class C{
		void method2() {
			//field1=3;
			//method1();
			
			field2=20;
			method2();
		}
	}//정적멤버 내부클래스 > 외부클래스의 인스턴스 변수와 인스턴스 메소드에는 접근 못하고, 정적변수와 정적 메소드에만 접근 가능하다.
}
