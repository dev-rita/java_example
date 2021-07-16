import net.abc.model.ShapeClass;
import net.abc.model2.Circ;
import net.abc.model2.Rect;
import net.abc.model2.Tria;

public class AbsEx15 {
	static void dr(ShapeClass ref) {
		//ShapeClass의 자손은 다 받을 수 있는 매개변수 다형성>>상속과 업캐스팅(참조타입간의 형변환)
		ref.draw();
	}
	public static void main(String[] args) {
		//ShapeClass로 ref참조변수를 선언한 다음 각 자손 클래스를 업캐스팅한 후 오버라이딩 된 메소드를 호출
		ShapeClass ref;//조상 추상클래스 타입으로 참조변수 선언
		
		ref=new Circ();//업캐스팅
		ref.draw();//업캐스팅 후 오버라이딩 된 메소드 호출.
		
		ref=new Rect();
		ref.draw();
		
		ref=new Tria();
		ref.draw();
		
		System.out.println("===========================");
		//ShapeClass 타입인 배열크기가 3인 arr배열을 생성한 다음 3개의 자손클래스 객체주소를 
		//배열원소값으로 저장한 후, 일반 for 반복문으로 오버라이딩 된 메소드를 호출
		ShapeClass[] arr=new ShapeClass[3];//추상클래스로 배열을 생성
		arr[0]=new Circ();
		arr[1]=new Rect();
		arr[2]=new Tria();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
		}
		System.out.println("===========================");
		//static void dr(ShapeClass ref){}정적 메소드를 정의해서 매개변수 다형성 문법을 적용하여 
		//3개의 자손클래스에서 오버라이딩한 메소드를 호출해본다.
		dr(new Circ());//업캐스팅
		dr(new Rect());
		dr(new Tria());
	}

}
