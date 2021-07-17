interface IHello5{
	void hello(String name);//public abstract가 생략.
}

interface IGoodBye5{
	public abstract void goodBye(String name); 
}

interface ITotal extends IHello5, IGoodBye5{
	//클래스, 추상클래스는 다중상속을 받을 수 없지만 인터페이스는 가능하다.
	//인터페이스가 인터페이스를 상속할 때 extends를 사용하고 다중상속을 받을 수 있다.
	void greeting(String name);
}

class Total implements ITotal{

	@Override
	public void hello(String name) {
		System.out.println(name+" hello!");
	}

	@Override
	public void goodBye(String name) {
		System.out.println(name+" goodBye!");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+" nice to see you!");
	}
	
}

public class Inter05 {

	public static void main(String[] args) {
		Total t=new Total();
		t.hello("1");
		t.goodBye("1");
		t.greeting("1");
	}

}
