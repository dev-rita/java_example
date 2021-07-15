class Point23{//extends Object
	protected int a=10;
	protected int b=20;
	
	//생성자가 오버로딩되면 자바는 기본생성자를 묵시적으로 제공하지 않는다.
	public Point23(int a, int b) {
		super();//최고조상 Object의 기본생성자를 먼저 호출하면서 끝이 남.
		this.a=a;
		this.b=b;
	}
	
}

class Point24 extends Point23{
	protected int c=30;
	
	public Point24(int a, int b, int c) {
		super(a,b);//부모클래스 오버로딩된 2개의 전달인자 생성자를 호출하도록 경로를 변경
		this.c=c;
	}
	
	public void pr() {
		System.out.println("a="+a+", b="+b+", c="+c);
	}
}
public class Extends09 {

	public static void main(String[] args) {
		Point24 pt=new Point24(100,200,300);//오버로딩된 생성자 호출.
		pt.pr();
	}

}
