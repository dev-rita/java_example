class Point071{//extends Object으로 부터 묵시적 상속을 받는다.	
	protected int x=10;
	protected int y=20;
	public Point071() {
		super();//생략가능. 최고 조상 Object의 기본 생성자를 먼저 호출.
		System.out.println("부모클래스 Point07 기본생성자");
	}
}
class Point08 extends Point071{
	protected int z=30;
	public Point08() {
		//super(); 생략됨. 조상 클래스 Point07의 기본생성자를 먼저 호출.
		System.out.println("Point071의 자손클래스 Point08 기본생성자");
	}
	public void pr(){
		System.out.println("x="+x+",y="+y+",z="+z);	}
}

class Point09 extends Point08{

	public Point09() {
		//super(); 생략됨. 조상 클래스 Point071, Point08의 기본생성자를 먼저 호출.
		System.out.println("Point08의 자손클래스 Point09 기본생성자2");
	}
}
public class Extends07 {

	public static void main(String[] args) {
		new Point08();
		new Point09();
	}
}
