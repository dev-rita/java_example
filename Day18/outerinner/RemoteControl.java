package outerinner;

public interface RemoteControl {
	
	public abstract void turnOn();//public abstract는 생략 가능.
	void turnOff();//추상메소드는 구현부가 없고 선언부만 있어 호출이 불가능하다.
}
