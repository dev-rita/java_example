package outerinner;

public class A {//외부클래스

	A(){System.out.println("A객체가 생성됨");}//기본 생성자
	
	//인스턴스 멤버 내부 클래스 >>외부클래스$내부클래스명.class(A$B.class)로 컴파일
	
	public class B{
		B(){System.out.println("B객체가 생성됨");}
		int field1;
		//static int field2; 에러
		void method1() {System.out.println(field1);}
		//static void method2() {}
	}//인스턴스 멤버 내부 클래스에는 인스턴스 변수와 메소드만 올 수가 있고 정적변수와 정적메소드는 올 수가 없다.
	
	//static으로 정의된 정적 멤버 내부 클래스 >> A$C.class로 컴파일
	static class C{
		C(){System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {System.out.println(field1);}
		static void method2() {System.out.println(field2);}
	}//정적 멤버 내부 클래스에는 인스턴스 변수와 메소드와 정적변수와 정적메소드가 올 수 있다.
	
	void method() {
		//로컬 지역클래스=메소드 내에 선언된 클래스를 말한다. A$1D.class(외부클래스명$번호 지역클래스명.class)로 컴파일.
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
			//static int field2; 에러
			void method1() {System.out.println(field1);}
			//static void method2() {} 에러
		}//로컬 지역 클래스에는 인스턴스 변수와 메소드만 올 수가 있고 정적변수와 정적메소드는 올 수가 없다.
		D d=new D();
		d.field1=9;
		d.method1();
	}
}
