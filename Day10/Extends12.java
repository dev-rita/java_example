class Point12{
	int x;
	int y;
	
	Point12(int x,int y){
		this.x=x;
		this.y=y;
	}//생성자 오버로딩
	
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}

class ChildPoint12 extends Point12{
	int z;
	
	ChildPoint12(int x, int y, int z){
		super(x,y);
		this.z=z;
	}

	//getLocation()메소드를 이클립스 메뉴로 오버라이딩을 시키고 조상 클래스 메서드를 호출하면서 x, y, z를 출력.
	@Override
	String getLocation() {
		return super.getLocation()+", z: "+z;
	}	

}
public class Extends12 {

	public static void main(String[] args) {
		
		ChildPoint12 ch=new ChildPoint12(3,5,7);
		System.out.println(ch.getLocation());
	}

}
