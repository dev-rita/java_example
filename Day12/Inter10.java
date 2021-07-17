interface I10{
	void methodB();//public abstract가 생략된 추상메소드
}

class B10 implements I10{
	@Override
	public void methodB() {
		System.out.println("methodB() in B class");
	}

	@Override
	public String toString() {
		return "class B";
	}
}

class InstanceManager{
	public static B10 getInstance(){ 
		//B10 객체타입으로 리턴타입을 지정.(I10으로 해도 상관 x) return타입에 맞게 설정.
		//만약 return타입이 여러개라면 해당 객체들을 implements 하는 인터페이스를 리턴타입으로 지정.
		return new B10();
	}
}

class A10{
	void methoadA() {
		I10 i=InstanceManager.getInstance(); //I10 i=new B10();>>업캐스팅
		i.methodB();//오버라이딩 된 메소드 호출
		System.out.println(i);//오버라이딩 된 toString()호출.
	}
}
public class Inter10 {
	public static void main(String[] args) {
		A10 a=new A10();
		a.methoadA();
	}
}
