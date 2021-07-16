
public class UpCast08 {

	public static void main(String[] args) {
		
		FireEngine fe=new FireEngine();
		Car06 car=new Car06();
		
		if(fe instanceof FireEngine) {
			System.out.println("fe는 파이어 엔진이다.");
		}
		
		if(car instanceof FireEngine) {
			System.out.println("FireEngine으로 다운캐스팅이 가능하다.");
			fe=(FireEngine)car;//다운캐스팅
		}else {System.out.println("다운캐스팅이 불가능하다.");}
		
		if(fe instanceof Car06) {
			System.out.println("업캐스팅이 가능하다.");
			car=fe;//업캐스팅
		}
		
		if(fe instanceof Object) {
			System.out.println("Object으로 업캐스팅이 가능하다.");
			Object obj=fe;//업캐스팅
		}
		
		if(car instanceof FireEngine) {
			System.out.println("FireEngine으로 다운캐스팅이 가능하다.");
			fe=(FireEngine)car;//다운캐스팅
		}
		
		if(car instanceof Object) {
			System.out.println("Object으로 업캐스팅이 가능하다.");
			Object obj=car;//업캐스팅
		}
	}

}
