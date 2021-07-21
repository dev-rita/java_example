
public class TryEx01 {

	public static void main(String[] args) {
		int a=10, b01=0, b02=2, result=0;
		
		try {
			result=a/b02;
			System.out.println(result);
			
			result=a/b01; //정수 숫자 10을 0으로 나누면 예외가 발생해서 아래문장을 실행하지 않고 해당 catch블록으로 이동해서 예외처리를 한다.
			System.out.println(result);//이문장은 실행하지 않는다.
			
		}catch(Exception e) {//try 구문안에서 예외가 발생하면 catch블록 실행하여 에러 처리
			System.out.println("예외발생:");
		}
	}
}
