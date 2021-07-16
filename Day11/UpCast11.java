class Parent11{
	int a=100;
	
	void m() {
		System.out.println("부모클래스 메소드 m()");
		System.out.println("a="+a);//this.a
	}
}

class Child11 extends Parent11{
	int a=200;

	@Override
	void m() {
		System.out.println("오버라이딩된 메소드 m()");
		System.out.println("a="+a);
		//this.a와 같다. 부모클래스 멤버변수 a와 동일 멤버변수가 자손에서 정의된 경우 자손클래스의 멤버변수를 호출한다.
		System.out.println("this.a="+this.a);
		System.out.println("super.a="+super.a);//부모클래스에서 상속받은 멤버변수 a
	}
	
	
}
public class UpCast11 {

	public static void main(String[] args) {
		Parent11 p=new Child11();
		p.m();//업캐스팅 이후 오버라이딩 된 메소드 호출.
		
	}

}
