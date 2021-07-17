class Point{//extends Object이 생략됨.
	int x, y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}//생성자 오버로딩

	@Override
	public String toString() {//인스턴스에 대한 정보를 문자열로 제공한 목적으로 정의한 것.
		return "x 좌표값 :"+x+", y 좌표값 :"+y;
	}
	
}

public class ObjectToStirng12 {

	public static void main(String[] args) {
		Point p=new Point(100,200);
		System.out.println(p);
		System.out.println(p.toString());
	}

}
