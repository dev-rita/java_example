class Parent09{
	int x=100;
	
	void method() {
		System.out.println("부모클래스 메소드 method()");
	}
}

class Child09 extends Parent09{
	int x=200;

	@Override
	void method() {
		System.out.println("오버라이딩 된 method()");
	}
	
}
public class UpCast09 {

	public static void main(String[] args) {
		Parent09 p=new Child09();//업캐스팅
		System.out.println("p.x="+p.x);
		//멤버변수가 부모와 자손 모두 정의된 경우는 변수의 참조타입에 의해서 호출되는 멤버변수가 결정된다.
		p.method();//오버라이딩 된 메소드 호출은 p가 실제 가리키는 객체 타입에 의해서 결정된다. 
		//업캐스팅 후에는 자손에서 오버라이딩 한 메소드를 호출한다.
		
		Child09 c=new Child09();
		c.method();
		System.out.println("c.x="+c.x);
		
	}

}
