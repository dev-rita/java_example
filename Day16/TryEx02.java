public class TryEx02 {
	public static void main(String[] args) {
		int a=10, b01=0, b02=2, re=0;		
		try {
			re=a/b02;
			System.out.println(re);
			
			re=a/b01;//정수숫자 0으로 나누어서 예외가 발생함. 아래 문장 실행하지 않고 해당 catch블록으로 이동해서 예외처리를 한다.
			System.out.println(re);
			
		}catch(ArithmeticException ae) {//산술예외 정수 숫자를 0으로 나누면
			System.out.println("예외발생:"+ae);
		}catch(Exception e) {
			System.out.println("예외 발생2"+e);
		}//복수개의 catch블록({})이 나올 때는 Exception 예외 처리 자손클래스가 먼저 기술되고
		//조상클래스가 나중에 기술된다. 순서가 바뀌면 에러.
	}
}
