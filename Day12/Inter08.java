class A{
	public void methodA(B b) {//a와 b가 직접 연결됨
		b.methodB();
	}
}

class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

class C{
	public void methodC() {
		System.out.println("methodC()");
	}
}
public class Inter08 {

	public static void main(String[] args) {
		A a=new A();
		a.methodA(new B());//new C는 안됨. 만약에 class C extends B라면 된다. 
	}

}
