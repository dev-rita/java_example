class Car06{
	String color;
	int door;
	
	void drive() {
		System.out.println("운전 가능하다");
	}
	
	void stop() {
		System.out.println("운전을 멈춤");
	}
}

class FireEngine extends Car06{
	String color="red";
	void water() {
		System.out.println("소방차는 물을 뿌린다.");
	}
}
public class UpCast06 {

	public static void main(String[] args) {
		Car06 car=new FireEngine();//업캐스팅
		car.drive(); 
		car.stop();
		
		FireEngine fe=(FireEngine)car;//명시적인 다운캐스팅, 업캐스팅 한것에 대해서만 다운캐스팅 가능.
		fe.water();
		fe.stop();
		fe.drive();
		
	}

}
