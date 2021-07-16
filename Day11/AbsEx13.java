abstract class AbsClass14{
	//추상클래스에 일반 변수와 메소드도 올 수 있다.
	abstract void m01();//추상메소드는 구현부{}가 없다.(실행문장이 없고 호출이 불가능하다.)
	void m02() {
		System.out.println("일반 메소드 m02()");
	}
	
}

class SubClass14 extends AbsClass14{
	//The type SubClass13 must implement the inherited abstract method AbsClass13.m01()
	//조상 추상클래스의 추상메소드는 반드시 자손 일반클래스에서 오버라이딩을 해야 자손클래스로 객체를 생성할 수 있다.
	@Override
	void m01() {
		System.out.println("오버라이딩 된 메소드");
	}
}
public class AbsEx13 {

	public static void main(String[] args) {
		AbsClass14 abs;//추상클래스로 참조변수 선언
		abs=new SubClass14();//업캐스팅도 가능함		
		abs.m01();//업캐스팅 후 오버라이딩 된 메소드 호출
		abs.m02();
		
		SubClass14 sub=new SubClass14();
		sub.m01();
		sub.m02();
	}

}
