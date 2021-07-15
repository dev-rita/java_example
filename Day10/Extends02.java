class Point02{//extends Object
	private int x;
	private int y;
	public int getX() {//값 반환 메소드 >> getter() 메소드라고 함.
		return x;
	}
	public void setX(int x) {//값 저장 메소드 >> setter() 메소드라고 함.
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

class Point03 extends Point02{
	private int z;//기본값 0

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
public class Extends02 {

	public static void main(String[] args) {
		Point03 pt=new Point03();
		pt.setX(100);
		pt.setY(200);//상속 받아서 저장.
		pt.setZ(300);
		
		System.out.println("X좌표:"+pt.getX()+", Y좌표:"+pt.getY()+", Z좌표:"+pt.getZ());
	}

}
