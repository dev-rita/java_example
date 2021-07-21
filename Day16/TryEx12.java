
public class TryEx12 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(10/0);//예외가 발생
			System.out.println(4);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();//예외가 발생하면 예외 족적(발자취)을 남긴다.
			System.out.println("===============================");
			System.out.println("예외 메시지: "+ae.getMessage());//예외 에러 메시지
		}
		System.out.println(5);
	}
}
