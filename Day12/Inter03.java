interface IHello3{
	void hello(String name);//public abstract가 생략됨.
}

interface IGoodBye3{
	void bye(String name);//public abstract가 생략됨.
}

class ChildSubClass3 implements IHello3, IGoodBye3{ 
	//인터페이스는 하나 이상의 조상으로 부터 다중 상속이 가능하다.

	@Override
	public void hello(String name) {
		System.out.println(name+"씨 안녕!");
	}

	@Override
	public void bye(String name) {
		System.out.println(name+"씨 잘가!");
	}
	
}//조상이 둘 이상이면 업캐스팅 할 필요가 없다.
public class Inter03 {

	public static void main(String[] args) {
		ChildSubClass3 csc=new ChildSubClass3();
		
		csc.hello("홍");
		csc.bye("홍");
	}

}
