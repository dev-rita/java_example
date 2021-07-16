class Parent02{
	void p02() {
		System.out.println("부모클래스 메소드 p02()");
	}
}
class Child02 extends Parent02{
	void ch02() {
		System.out.println("자손클래스 메소드 ch02()");
	}
}
public class UpCast02 {
	public static void main(String[] args) {
		Parent02 p=new Child02();//업캐스팅
		p.p02();
		
		//Child02 ch1=new Parent02(); //에러
		Child02 ch=new Child02();
		ch.p02();
		ch.ch02();
		ch=(Child02)p;//다운캐스팅 >>업캐스팅 했던 클래스만 가능.
		
		/*다운캐스팅 특징)
		 * 1.다운캐스팅을 하려면 사전에 상속관계를 만들어야 한다.
		 * 2.다운캐스팅이란 부모클래스형이 자손클래스 형으로 형변환이 이루어지는 것을 말한다.
		 * 3.다운캐스팅을 하려면 반드시 사전에 업캐스팅이 되어야 한다. 업캐스팅이 된 것에 한해서만
		 * 다운캐스팅을 허용한다. 명시적인 캐스팅 즉 형변환 연산자를 사용해서 강제 형변환을 해야한다.
		 */
		
		ch.p02();
		ch.ch02();
	}

}
