package outerinner;

public class Anonymous2 {

	//익명 객체를 필드 초기값으로 설정
	RemoteControl field=new RemoteControl() {
		/*멤버변수 초기값으로 익명객체를 설정하고 추상메소드를 오버라이딩한다.
		 *anonymousEx2.java생성하고  Anonymous2객체를 생성한다.
		 */
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}

	};//Anonymous2$1.class
	
	void method01() {
		//지역 변수값으로 익명 객체를 대입
		RemoteControl localVar=new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}	
		};//Anonymous2$2.class
		localVar.turnOn();
	}
	
	void method02(RemoteControl rc) {
		rc.turnOn();
	}
}
