class St17{
	static int a=10;//정적 변수
	int b=20;//인스턴스 변수
	
	public void print() {
		System.out.println("Hello");
	}//인스턴스 메소드
	
	public static void printB() {
		System.out.println("Hello");
	}//정적 메소드
	
	public static void printA() {
		St17 s=new St17();
		s.print();//인스턴스를 생성해야 인스턴스 메소드 및 변수를 사용할 수 있다.
	//	print();//정적메소드 내에서 인스턴스 메소드를 사용할 수 없다.
	//	System.out.println(b);//정적메소드 내에서 인스턴스 변수를 사용할 수 없다.
	//	System.out.println(this.b);//정적메소드 내에서 this를 사용할 수 없다.
		printB();//정적메소드 내에서 정적메소드 사용 가능.
		System.out.println(a);//정적메소드 내에서 정적변수 사용 가능.
	//	System.out.println(this.a);//정적메소드 내에서 this를 사용할 수 없다.
	}//정적 메소드
}
public class thisEx17 {

	public static void main(String[] args) {

		new St17().printA();
		St17.printA();
	}

}
