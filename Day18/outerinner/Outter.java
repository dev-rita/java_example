package outerinner;

public class Outter {
	//jdk 1.7이전
	public void method1(final int arg) {
		final int localVariable=1;		
		class Inner{//지역클래스
			public void method() {
				int result=arg+localVariable;
			}
		}//지역클래스 객체는 method1()메소드 호출이 끝이 나도 메모리에 남아 있다.
		//하지만 arg매개변수와 지역변수인 localVariable(method안의 변수)은 메소드 호출이 끝이 나면 메모리에서 사라진다.
		//이 경우 지역클래스 객체가 매개변수와 지역변수를 사용할 경우 문제가 발생하기 때문에 각각 final상수로 해서 값을
		//변경하지 못하게 막아야 한다. jdk1.8이후로는 final을 생략해도 상수로 인식된다. 즉 생략 가능하다.
		//주로 안드로이드 모바일 앱 개발 코드에서 많이 사용한다.
	}
	
	//jdk 1.8이후
	public void method2(int arg) {//final이 생략된 상태.
		int localVariable=1;//final이 생략된 상태.		
		//arg=100; 상수라서 에러
		//localVariable=50; 상수라서 에러
		class Inner{//지역클래스
			public void method() {
				int result=arg+localVariable;
			}
		}
	}
}
