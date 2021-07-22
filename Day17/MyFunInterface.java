@FunctionalInterface//함수형 인터페이스는 추상메소드가 딱 하나만 올 수 있다. 함수형 인터페이스는 람다식을 위한 인터페이스이다.
public interface MyFunInterface {
	void method();//public abstract가 생략된 추상 메소드
}
