
public class MethodTest13 {

	public static void main(String[] args) {
		
		int[] x= {10};
		System.out.println("main():x="+x[0]);
		
		change(x);
		System.out.println("After change(x):"+x[0]);
	}

	static void change(int[] x) {//배열형 매개변수도 참조타입이다. 참조타입일때 주소를 공유하므로 값이 변경됨.
		x[0]=100;
		System.out.println("change() 메소드 호출 후:"+x[0]);
	}
}
