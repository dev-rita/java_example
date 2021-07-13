class ValueMethod{
	int i;
	void change(int x) {//기본형 매개변수
		x=1033;
		System.out.println("메소드 x->"+x);//메소드 종료되면 x=1033은 사라짐.
	}
}
public class MethodTest08 {

	public static void main(String[] args) {
		
		ValueMethod vm=new ValueMethod();
	
		int x=8;
		System.out.println("메소드 호출전 x->"+x);
		
		vm.change(x);
		System.out.println("메소드 호출후 x->"+x);
	}
}
