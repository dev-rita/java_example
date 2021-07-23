package outerinner;

public class AnonymousExample2 {

	public static void main(String[] args) {
		Anonymous2 anony=new Anonymous2();
		//익명객체 필드 사용		
		anony.field.turnOn();//"Tv를 켭니다"가 출력.
		anony.method01();
		//메소드 인자값으로 익명객체를 사용해서 스마트 TV를 켭니다를 출력.
		anony.method02(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다.");}
			
			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");}
			}//AnonymousExample2$1.class
		);
	}
}
