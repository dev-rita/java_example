class A2{
	public String toString() {
		return "4";
	}
	public String toString2() {
		return "5";
	}
}

class B2 extends A2{
	@Override
	public String toString() {
		return super.toString()+"3";
	}
}
public class Ex16_9 {

	public static void main(String[] args) {
		System.out.println(new B2());
		//toString은 기본메소드로 new B2().toString()로 안해도 호출이 된다. 
		//43인 이유는 부모클래스 A2의 toString()이 같이 호출되었기 때문.
		System.out.println(new A2());
	}

}
