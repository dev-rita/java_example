interface IColor{
	int RED=1; //인터페이스에 오는 변수는 public static final로 인식되는 정적상수이다.
	public static final int GREEN=2;//public static final은 생략가능.
	public static final int BLUE=3;

	void setColor(int c);//public abstract가 생략된 추상메소드
	public abstract int getColor();//public abstract는 생략가능. 추상메소드
}

abstract class AbsColor implements IColor{
	//class가 interface를 상속받지는 못한다.implements사용. interface가 interface를 상속받을 수는 있음.
	//extends 및 implements 할 때 추상메소드는 오버라이딩 해야 컴파일 에러가 안난다.
	int color=GREEN;//추상클래스에서 일반변수 생성

	@Override
	public void setColor(int c) {
		color=c;
	}
	
}

class Child06 extends AbsColor{

	@Override
	public int getColor() {
		return color;
	}
	
}

public class Inter06 {

	public static void main(String[] args) {
		Child06 child=new Child06();
		child.setColor(IColor.RED);//RED는 static으로 정의된 정적변수이기 때문에 해당 인터페이스로 접근
		System.out.println(child.getColor());
	}

}
