class Parent16{
	private int a; 
	int b;
	protected int c;
	int d;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class Child16 extends Parent16{
	public Child16() {}
	public Child16(int b, int c, int d) {
		//setA(a);(=super.setA(a);) //this.a 에러/ a를 protected로 바꾸면 해결됨.
		this.b=b;
		this.c=c;
		this.d=d;
	}//생성자 오버로딩>>생성자의 주된기능인 멤버변수 중 인스턴스 변수 초기화이다. 생성자는 상속되지 않는다.
	
	void func() {
		//System.out.print(getA());(=super.getA(a);) //print(a) 에러/ a를 protected로 바꾸면 해결됨.
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
	}
}
public class Ex16_2 {

	public static void main(String[] args) {
		Child16 one=new Child16(2,3,4);
		Parent16 two=new Parent16();
		two.setA(1);
		System.out.print(two.getA());
		one.func();
	}

}
