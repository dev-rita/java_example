
public class Data02 {

	public static void main(String[] args) {
	/*자바의 변수 선언방법:
	 * 자료형 변수명;
	 * 변수란 단 한개의 값만 저장하는 장소를 뜻하며, 마지막에 저장된 값만 저장된다.
	 * 변수를 선언하고 최초값을 저장하는 것을 초기화라고 한다. 
	 */
		int year=2021;
		int age=25; //year, age 2개의 변수명이 선언되고 각 변수값이 초기화 됨.
		
		System.out.println("년도:"+year); //+는 문자열 연결 연산기호
		System.out.println("나이:"+age);
		
		age=age+10; //숫자+숫자에서 +는 덧셈연산기호
		System.out.println("덧셈한 값="+age);
		System.out.println("==========>");
		
		int x=10;
		int y=20;
		int tmp=0;
		System.out.println("x="+x+" y="+y);
		
		tmp=x;
		x=y; // =는 오른쪽 값을 왼쪽변수에 대입하는 대입연산자이다.
		y=tmp;
		
		System.out.println("변경된 x변수 값="+x+"\n수정된 y변수값= "+y+"\ntmp값="+tmp);
		
	}

}
