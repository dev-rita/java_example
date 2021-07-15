class Point13{
	int x=10;
	int y=20;
	
	Point13(int x,int y){
		super();//생략가능함, 최고 조상 Object의 기본생성자를 호출.
		this.x=x;
		this.y=y;
	}
}

class ChildPoint13 extends Point13{
	int z=30;
	
	ChildPoint13(){
		this(100,200,300);//같은 클래스 내의 오버로딩 된 다른 생성자를 호출.
	}
	
	ChildPoint13(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	
	//별도의 메소드를 정의해서 x, y, z 멤버변수값을 출력하자.
	void pr() {
		System.out.println("x="+x+", y="+y+", z="+z);
	}
}
public class Extends13 {

	public static void main(String[] args) {
		ChildPoint13 cp=new ChildPoint13();
		cp.pr();
	}

}
