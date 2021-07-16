abstract class AbsClass21{
	abstract void m01();//추상메소드는 구현부{}가 없다.(실행문장이 없고 호출이 불가능하다.)
	void m02() {
		System.out.println("AbsClass21 m01() 메소드");
	}
}

abstract class MiddleClass extends AbsClass21{
	//조상 추상클래스의 추상메소드는 반드시 자손 일반클래스에서 오버라이딩을 해야하지만 자손 추상클래스에서는 안해도 된다.
	abstract void m03();
	void m04() {
		System.out.println("MiddleClass m03()");
	}
}

class SubClass21 extends MiddleClass{
	//조상 추상클래스의 추상메소드는 반드시 자손 일반클래스에서 오버라이딩을 해야 자손클래스로 객체를 생성할 수 있다.
	@Override
	void m01() {
		System.out.println("추상메소드 AbsClass21를 오버라이딩");
	}

	@Override
	void m03() {
		System.out.println("추상메소드 MiddleClass를 오버라이딩");
	}
}

public class AbsEx14 {

	public static void main(String[] args) {
		AbsClass21 abs;//추상클래스로 참조변수 선언
		abs=new SubClass21();//업캐스팅도 가능함		
		abs.m01();//SubClass21의 오버라이딩 메소드 호출
		abs.m02();
		//abs.m03();는 에러. AbsClass21에 해당 메소드가 없기 때문.
		
		SubClass21 sub=new SubClass21();
		sub.m01();//상속받아 호출(오버라이딩)
		sub.m02();//상속받아 호출
		sub.m03();//상속받아 호출(오버라이딩)
		sub.m04();//상속받아 호출
	}
}
//패키지는 유사클래스를 묶음. net.abc인 도메인 역순으로 하는 이유는 abc는 동일 도메인명 abc로 등록할 수 없다.
//같은이름 클래스라고 해도 다른 곳에 저장되어있기 때문에 같은 이름으로 사용 가능. \net\abc\model
//포괄적 이름이 상위패키지로 가기 위해서인 이유도 있다.
//상위패키지.하위패키지.클래스명
