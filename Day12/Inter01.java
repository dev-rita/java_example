interface IHello1{//인터페이스는 interface예약어로 정의한다.
	void sayHello(String name); // == public abstract void sayHello(Stirng name);
	//추상메소드는 선언부만 존재. 구현부(실행문장X)이 없고 호출이 불가능하다. 
	//인터페이스 오는 추상메소드에서는 public abstract을 생략 가능하다. 추상클래스에서는 생략 못함.
}
/*인터페이스 상속하는 법>
 * class 자손클래스 implements 인터페이스 {}
 * implements로 인터페이스를 구현 상속한다.
 */
class HelloChild implements IHello1{
	//상속받은 IHello1의 추상메소드를 오버라이딩해야한다.
	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕!");
	}
}

public class Inter01 {

	public static void main(String[] args) {
		IHello1 ih;//인터페이스로 참조 즉 레퍼런스 변수 선언 가능.
		ih=new HelloChild();//업캐스팅 가능.
		
		ih.sayHello("홍길동");
	}

}
