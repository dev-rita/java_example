class Point04{
	private int x=10;
	private int y=20;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

class Point05 extends Point04{
	protected int z=30;
	public void print() {
		System.out.println("x="+getX()+"y="+getY()+"z="+z); 
		//x,y멤버변수는 private로 정의되어 외부클래스에서 접근 못함. get함수 사용
	}
	
}
public class Extends03 {

	public static void main(String[] args) {
		Point05 pt=new Point05();
		
	}
}
