abstract class Hello3{
	public abstract void sayHello(String name);
}

abstract class GoodBye3{
	public abstract void sayBye(String name);
}

interface i1{
	void sayHello(String name); // == public abstract void sayHello(Stirng name);
}

interface i2{
	void sayBye(String name); // == public abstract void sayBye(Stirng name);
}

interface i3 extends i1,i2{
	//인터페이스 i1,i2 다중상속이 가능하며, 인터페이스도 추상클래스와 비슷하기 때문에
	//상속받은 메소드를 오버라이딩 할 필요가 없다.
	//인터페이스에서 인터페이스를 상속받으려면 extends를 사용.
}

abstract class SubClass implements i1, i2{
	//인터페이스 i1,i2 다중구현이 가능하며, 추상클래스이기 때문에
	//상속받은 메소드를 오버라이딩 할 필요가 없다.
	//클래스에서 인터페이스를 구현하려면 implements를 사용.
}

class SubClass2 implements i1,i2{
	//인터페이스 i1,i2 다중구현이 가능하며, 일반클래스에서 구현할 때는 
	//부모인터페이스의 추상메소드를 반드시 오버라이딩을 해야한다.
	@Override
	public void sayBye(String name) {
		System.out.println("HI!"+name);
	}

	@Override
	public void sayHello(String name) {
		System.out.println("BYE!"+name);
	}	
}

/*class SubClass3 extends Hello3, Goodbye3{
  //클래스 또는 추상클래스는 다중상속을 받을 수 없다.
}*/

public class Inter02 {

	public static void main(String[] args) {

	}

}


