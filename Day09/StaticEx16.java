class St16{
	private static int a=10;//정적변수
	
	public static void setA(int new_a) {
		a=new_a;
	}//static으로 정의된 메소드를 정적메소드 또는 클래스메소드라고 한다. 정적메소드는 해당 클래스명으로 직접 접근가능하다.

	public static int getA() {
		return a;
	}//값 반환 메소드
	//정적 변수와 정적메소드는 제한적으로 사용해야한다. (무거움) 
	//인스턴스 변수는 사용하는 메모리만 사용하기때문에 인스턴스 변수가 정적 변수보다 가볍고 빠르다.
}
public class StaticEx16 {

	public static void main(String[] args) {
		St16.setA(100);
		int result=St16.getA();
		System.out.println(result);
		
		St16 s=new St16();
		s.setA(200);//클래스 메소드이기 때문에 객체로 접근하면 더 오래걸리므로 경고.
		System.out.println(s.getA());
	}

}
