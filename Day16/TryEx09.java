
public class TryEx09 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);//이 문장이 실행되려면 try문에서 예외가 발생해야 한다.
		}
		System.out.println(6);
	}
}
