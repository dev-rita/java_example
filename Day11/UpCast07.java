
public class UpCast07 {

	public static void main(String[] args) {
		Car06 car=new Car06();
		FireEngine fe=(FireEngine)car;
		//사전에 업캐스팅을 하지 않아서 명시적인 다운캐스팅을 할 때 연산 예외 오류가 된다.
		fe.water();
		fe.drive();
		fe.stop();
	}

}
