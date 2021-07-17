interface I{
	public abstract void play();
}

class B2 implements I{
	@Override
	public void play() {
		System.out.println("play in B class");
	}
}

class C2 implements I{

	@Override
	public void play() {
		System.out.println("play in C class");
	}
}

class A2 {
	void autoPlay(I i) {//매개변수 다형성 I가 B2, C2의 부모이므로 다 호출 가능.
		i.play();//업캐스팅 후 오버라이딩 된 메소드 호출.
	}
}
public class Inter09 {

	public static void main(String[] args) {
		A2 a=new A2();
		a.autoPlay(new B2());//I i=new B2();>>업캐스팅
		a.autoPlay(new C2());
		
	}

}
