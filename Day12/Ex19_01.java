//net.abc.model패키지를 만들고, IShapeClass라는 인터페이스를 생성하고, void draw();추상메소드를 정의한다.
//net.abc.model2 패키지를 만들고, 이클립스 메뉴를 사용해서 IShapeClass 인터페이스를 구현상속한 자손클래스 Circ, Rect, Tria을 생성한다.
//default 패키지의 Ex19_01에서 인터페이스로 ref참조변수를 선언한 다음 각 자손 클래스를 업캐스팅한 후 오버라이딩 된 메소드를 호출한다.
//Ex19_01 클래스에서 IShapeClass인터페이스 타입인 배열크기가 3인 arr배열을 생성한 다음 3개의 자손클래스 객체주소를 배열원소값으로 저장한 후
//일반 for 반복문으로 오버라이딩 된 메소드를 호출한다.
//Ex19_01 클래스에서 static void pr(IShapeClass ic){}정적 메소드를 정의해서 매개변수 다형성 문법을 적용하여 3개의 자손클래스에서 
//오버라이딩한 메소드를 호출해본다.
//출력결과물 >> 원을 그린다. \n 사각형을 그린다 \n 삼각형을 그린다 \n================ \n 원을 그린다. \n 사각형을 그린다 \n 삼각형을 그린다
// \n================ \n 원을 그린다. \n 사각형을 그린다 \n 삼각형을 그린다

import net.abc.model.IShapeClass;//IShapeClass 인터페이스
import net.abc.model2.Circ;//IShapeClass 인터페이스 상속받은 Circ
import net.abc.model2.Rect;//IShapeClass 인터페이스 상속받은 Rect
import net.abc.model2.Tria;//IShapeClass 인터페이스 상속받은 Tria

public class Ex19_01 {
	static void pr(IShapeClass ic) {//자손은 다 받을 수 있는 매개변수 다형성>>상속과 업캐스팅(참조타입간의 형변환)
		ic.draw();
	}
	public static void main(String[] args) {
		
		//인터페이스로 ref참조변수를 선언한 다음 각 자손 클래스를 업캐스팅한 후 오버라이딩 된 메소드를 호출
		IShapeClass ref;//조상 추상클래스 타입으로 참조변수 선언
		
		ref=new Circ();//업캐스팅
		ref.draw();//업캐스팅 후 오버라이딩 된 메소드 호출.
		
		ref=new Rect();
		ref.draw();
		
		ref=new Tria();
		ref.draw();
		
		System.out.println("===========================");
		
		//인터페이스 타입인 배열크기가 3인 arr배열을 생성한 다음 3개의 자손클래스 객체주소를 배열원소값으로 저장한 후
		//일반 for 반복문으로 오버라이딩 된 메소드를 호출
		IShapeClass[] arr=new IShapeClass[3];//추상클래스로 배열을 생성
		arr[0]=new Circ();
		arr[1]=new Rect();
		arr[2]=new Tria();
		
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
		}
		
		System.out.println("============================");
		
		//static void pr(IShapeClass ic){}정적 메소드를 정의해서 매개변수 다형성 문법을 적용하여 
		//3개의 자손클래스에서 오버라이딩한 메소드를 호출해본다.
		pr(new Circ());//업캐스팅 >> IShapeClass ic=new Circ
		pr(new Rect());
		pr(new Tria());
		
	}

}
