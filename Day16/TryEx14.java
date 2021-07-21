public class TryEx14 {
	static void method1() throws Exception//5.해당 메소드를 호출한 곳으로 예외를 떠넘김
	{
		try {
			throw new Exception();//2.인위적으로 예외를 발생.
		}catch(Exception e) {
			System.out.println("method1 메소드에서 예외 처리 함.");//3.예외처리 문장 실행
			throw e;//4.인위적으로 예외를 발생
		}
	}
	public static void main(String[] args) {
		try {
			method1();//1.method1()실행
		}catch(Exception e) {
			System.out.println("메인 메소드에서 예외처리함.");//6.떠넘겨진 예외처리 문장 실행
		}
	}
}

