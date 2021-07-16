class Parent10{//extends Object이다.
	int x=100;
	
	void method() {
		System.out.println("부모클래스 메소드");
	}
}
class Child10 extends Parent10{
	
}

public class UpCast10 {

	public static void main(String[] args) {
		Parent10 p=new Child10();//업캐스팅
		System.out.println("p.x="+p.x);//부모클래스에 선언된 멤버변수 호출
		p.method();//상속받아서 호출
		
		Child10 c=new Child10();
		System.out.println("c.x="+c.x);//상속받아서 호출.
		c.method();//상속받아서 호출
	}

}
