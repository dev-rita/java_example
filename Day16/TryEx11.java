public class TryEx11 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(7/0);//예외가 발생
			System.out.println(4);//이 문장 실행안함
		}catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) 
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println(5);
	}
}
