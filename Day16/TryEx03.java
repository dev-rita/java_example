public class TryEx03 {
	public static void main(String[] args) {
		int a=10, b01=0, b02=3, re=0;	
		try {
			System.out.println("try 구문 들어옴.");
			re=a/b02;
			System.out.println(re);
			
			re=a/b01;//정수숫자 0으로 나누어서 예외가 발생함. 아래 문장 실행하지 않고 해당 catch블록으로 이동해서 예외처리를 한다.
			System.out.println(re);//실행안함
			
		}catch(ArithmeticException ae) {
			System.out.println("예외발생1:"+ae);
		}catch(Exception e) {
			System.out.println("예외발생2:"+e);
		}finally {
			System.out.println("try~catch 예외와 상관없이 무조건 마지막에 실행됨.");
		}
	}
}
