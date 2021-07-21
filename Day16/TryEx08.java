
public class TryEx08 {

	public static void main(String[] args) {
		int number=100;
		int result=0;
		
		//for반복문내에서 try~catch문을 활용하여 0 난수가 발생해도 프로그램이 종료 안되고 계속 실행되게 하면서 0난수값을 출력되게 만들자.
		for(int i=1;i<=10;i++) {
			try {
			result=number/(int)(Math.random()*10);
			System.out.println(result);
			}catch(ArithmeticException e) {//정수 숫자를 0으로 나눠지는 경우 예외 발생.
				System.out.println(0);//예외처리
			}
		}
		
		
		
		/*for(int i=1;i<=10;i++) {
			result=number/(int)(Math.random()*10);//랜덤이 0이상 10미만 사이의 정수 숫자 난수 발생.
			//0부터 9사이의 임의의 정수 숫자 난수가 발생함. 0난수가 발생하면 예외가 발생해서 프로그램이 멈춤.
			System.out.println(result);
		}*/
	}

}
