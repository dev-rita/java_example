class Parent04{
	public void p04() {
		System.out.println("부모클래스 메소드 p04()");
	}
}
class Child04 extends Parent04{
/*메소드 오버라이딩이란?
 * 1. 오버라이딩을 하려면 사전에 상속관계를 만들어야 한다.
 * 2. 메소드 오버라이딩이란 상속관계에서 부모클래스 메소드 명, 리턴타입, 전달인자 타입, 개수 등
 *    모두 동일한 원형을 자손클래스로 상속받은 상태에서 {}블록내의 문장을 자손클래스에 맞게 변경, 수정하는 것을 뜻함.
 * 3. 생성자는 상속이 안되기 때문에 생성자 오버라이딩은 없다.
 */

	@Override
	public void p04() {
		super.p04();
		System.out.println("자손클래스에 오버라이딩 된 메소드");
	}
	
	public void ch04() {
		System.out.println("자손클래스에 정의된 메소드 ch04()");
	}
	
}
public class Extends04 {

	public static void main(String[] args) {
		Child04 ch=new Child04();
		ch.p04();//오버라이딩 된 메소드 호출.
		ch.ch04();
		Parent04 p=new Parent04();
		p.p04();//부모클래스 메소드 호출.
		//p.ch04();는 에러. 자손클래스에서 추가된 메소드는 호출불가능.
	}

}
