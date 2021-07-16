class Parent05{
	int x=5;
	public void p05() {
		System.out.println("부모클래스 메소드 p05()");
	}
}
class Child05 extends Parent05{
	int x=4;
	
	@Override
	public void p05() {
		System.out.println("오버라이딩 된 메소드 p05()");
	}
	
	public void ch05() {
		System.out.println("자손클래스 메소드 ch05()");
	}
}
public class UpCast05 {

	public static void main(String[] args) {
		
		Parent05 p=new Parent05();
		p.p05();
		System.out.println(p.x);
		//p.ch05(); 컴파일 에러 자손 메소드 호출 불가능.
		
		Parent05 p2=new Child05();//업캐스팅
		p2.p05();//업캐스팅 후 오버라이딩 된 메소드 호출. 오버라이딩 없을 시 부모 메소드 호출.
		//p2.ch05(); 컴파일 에러 부모로부터 상속받은 메소드만 호출 가능.
		System.out.println(p2.x);
		
		Child05 ch=new Child05();
		ch.p05();
		ch.ch05();
		System.out.println(ch.x);
		
		ch=(Child05)p2;//다운캐스팅
		ch.p05();
		ch.ch05();
	}

}
