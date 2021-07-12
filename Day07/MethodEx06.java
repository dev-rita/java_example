
public class MethodEx06 {

	static void hello_func() {//static으로 정의된 정적 메소드, void는 리턴타입이 없는 자료형. 즉 반환값이 없다.
		System.out.println("Hello 자바의 사용자 정의 메소드");
	}//hello_func()메소드 정의
	public static void main(String[] args) {
		hello_func();//메소드 호출
	}
}
