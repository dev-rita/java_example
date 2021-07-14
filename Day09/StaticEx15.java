class St15{
	static int a=10;//static 예약어로 정의된 a를 해당클래스로 직접 접근하는 정적변수 또는 클래스변수라고 한다.
	int b=20;//객체 생성해서 접근하는 인스턴스 변수
	/* 클래스 구성 요소중 하나인 멤버변수 종류
	 * 1. 정적변수(클래스 변수): 생성된 모든 객체에 의해서 값을 공유한다.
	 * 2. 인스턴스 변수 : 생성된 객체마다 주소가 다르다. 그러므로 다른값을 가진다. 또한 클래스로 접근할 수 없다.
	 */
	
}
public class StaticEx15 {

	public static void main(String[] args) {
		System.out.println("St15.a:"+St15.a);//클래스명.정적변수
		St15 s01=new St15();
		St15 s02=new St15();
		
		System.out.println("s01.a:"+s01.a+", s02.a:"+s02.a);//St15.a로 하면 빠른데 객체 통해서 접근하니 경고.
		System.out.println("s01.b:"+s01.b+", s01.b:"+s02.b);
		
		s01.a=100;//정적변수값은 모든 객체에 의해서 공유되어 s01.a만 변경되어도 s02.a가 변경된다.
		System.out.println("s01.a:"+s01.a+", s02.a:"+s02.a);
		
		s01.b=200;//인스턴스 변수값은 각 객체마다 다르다.
		System.out.println("s01.b:"+s01.b+", s02.b"+s02.b);
	}

}
