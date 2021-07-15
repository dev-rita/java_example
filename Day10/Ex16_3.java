class Parent17{
	protected int a,b,c;
	
	public Parent17() {
	//super();가 생략됨. 최고 조상 Object의 기본생성자를 호출하면서 끝이 남.
	System.out.println("Parent17 클래스 기본생성자 호출");
	}
	
	public Parent17(int a, int b, int c) {
		System.out.println("Parent17 클래스 전달인자 3개짜리 오버로딩 된 생성자 호출");
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class Child17 extends Parent17{
	public Child17() {
		System.out.println("Child17 클래스 기본생성자 호출");
	}
	
	public Child17(int a, int b, int c) {
		super(a,b,c);//부모클래스 오버로딩 된 생성자 호출. 지정안하면 기본 생성자 호출
		System.out.println("Child17 클래스 오버로딩 된 생성자 호출");
	}
	
	public void pr() {
		System.out.print("a :"+a+", b :"+b+", c :"+c+"\n");
	}
}

public class Ex16_3 {

	public static void main(String[] args) {
		Child17 one=new Child17();
		one.pr();
		Child17 one1=new Child17(10,20,30);
		one1.pr();
	}

}
