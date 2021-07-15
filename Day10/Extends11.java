class Parent11{
	int x=10;
}
class Child11 extends Parent11{
	int x=20;
	void method() {		
		x=8; //지역변수가 있으면 지역변수가 들어감.
		System.out.println("x="+x);//상속된 변수 x
		System.out.println("this.x="+this.x);//내자신에 선언된 인스턴스 변수 x
		System.out.println("super.x="+super.x);//부모클래스의 변수 x
	}
}

public class Extends11 {

	public static void main(String[] args) {
		Child11 ch=new Child11();
		ch.method();
		System.out.println(ch.x);//8이출력
	}

}
