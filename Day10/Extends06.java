class Point06{
	protected int x=10;
	protected int y=20;
}

class Point07 extends Point06{
	protected int z=30;
	protected int x=40;
	protected int y=50;
	
	//기본 생성자 생략됨.
	
	public void print() {
		System.out.println("x="+x+", y="+y+", z="+z);//this.은 생략 가능하다.
	}
	
	public void print2() {
		System.out.println("x="+super.x+", y="+super.y+", z="+this.z);
		//부모클래스와 자손클래스에서 동일 멤버변수 즉 인스턴스 변수명이 정의된 경우
		//부모로부터 상속받은 인스턴스 변수에 접근하려면 super.변수명으로 접근한다.
	}
}
public class Extends06 {

	public static void main(String[] args) {
		Point07 pt=new Point07();
		pt.print();
		pt.print2();
	}

}
