class Parent01{//extends Object
	public void p01() {
		System.out.println("부모클래스 메소드 p01()");
	}
}
class Child01 extends Parent01{
	public void p01() {
		System.out.println("오버라이딩된 메소드 p01()");
	}
	public void c01() {
		System.out.println("자손클래스 메소드 c01()");
	}
}

public class Upcast01 {

	public static void main(String[] args) {
		Child01 ch=new Child01();
		ch.p01();//상속받아서 호출.
		ch.c01();//자신 메소드 호출.

		Parent01 p=new Parent01();
		p.p01();
		p=ch;//업캐스팅 > 상속관계에서 자손클래스 타입이 부모클래스 형으로 자동형 변환이 된다.
		p.p01();
		//p.c01(); 는 컴파일 에러
		ch.c01();
		ch.p01();
	}

}
