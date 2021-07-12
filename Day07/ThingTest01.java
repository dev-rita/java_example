 class Thing2{//Thing으로 하면 프로젝트 내에 이름이 같은 클래스가 정의되어 있기때문에 오류가뜸.
	private int x;
	void setThing(int newThing){//public은 default상태.
		x=newThing;
	}
	int getThing() {
		return x;
	}
}
public class ThingTest01 {

	public static void main(String[] args) {
		Thing2 thing1;//객체주소가 저장안된 참조변수
		thing1=new Thing2();//객체주소가 저장된 참조변수
		//thing1.x=10;
		//System.out.println(thing1.x);
		thing1.setThing(10);
		System.out.println(thing1.getThing());
	}
}
