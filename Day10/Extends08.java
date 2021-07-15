class Point21{
	protected int x=10;
	protected int y=20;
	
	//public Point21() {} 해결방법 1. 기본생성자를 생성한다 (잘 안씀)
	public Point21(int x, int y) {//생성자가 오버로딩 되면 기본생성자를 제공하지 않음.
		this.x=x;
		this.y=y;
	}
}

class Point22 extends Point21{
	protected int z=30;
	
	public Point22() {
		//super();부모클래스 기본생성자를 호출할려다가 에러가 발생.
		super(3,5);//해결방법 2. 가장 합리적 방법.
	}
}
public class Extends08 {

	public static void main(String[] args) {
		new Point22();//기본생성자 호출.
	}

}
