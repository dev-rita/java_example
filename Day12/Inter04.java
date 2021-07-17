interface IHello4{
	void sayHello(String name);
}

abstract class GoodBye4{
	public abstract void sayGoodBye(String name);
}
/*class ChildSubClass4  implements IHello4 extends GoodBye4{
	//이 문장은 컴파일 에러 extends가 implements보다 먼저와야 한다.
	@Override
	public void sayHello(String name) {
	}

	@Override
	public void sayGoodBye(String name) {
	}
	
}*/
class ChildSubClass5 extends GoodBye4 implements IHello4{

	@Override
	public void sayHello(String name) {
		System.out.println(name+" HELLO!");
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println(name+" BYE!");
	}
	
}
public class Inter04 {

	public static void main(String[] args) {
		ChildSubClass5 child=new ChildSubClass5();
		child.sayHello("lee");
		child.sayGoodBye("lee");
	}

}
