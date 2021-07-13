/* 메소드 오버로딩이란?
	 * 같은 한 클래스내에서 동일 이름의 메소드명을 중복해서 여러번 정의하는 것을 말한다.
	 * (반환 타입은 관계 없다.)
	 * 
	 * 오버로딩 된 메소드 구분 조건>>
	 * 1. 매개변수 즉 전달인자 타입을 다르게 한다.
	 * 2. 전달인자 개수를 다르게 한다.
	 * 3. 전달인자 순서를 다르게 한다.(잘 안쓰임.)
	 */
class Mt01{
	int abs(int a) {
		if(a<0) {
			a=-a;
		}
		return a;
	}
	
	double abs(double a) {
		if(a<0) {
			a=-a;
		}
		return a;
	}
}
public class MethodTest01 {

	public static void main(String[] args) {
		Mt01 m=new Mt01();
		System.out.println("-10의 절대값="+m.abs(-10));
		System.out.println("-10.3의 절대값="+m.abs(-10.3));
		double result=m.abs(-10.3);
		System.out.println("-10.3의 절대값="+result);
		
		
	}

}
