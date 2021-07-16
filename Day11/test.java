class Parent15{
	String color;
	public void p05() {
		System.out.println("부모클래스 메소드 p05()");
	}
}
class Child15 extends Parent15{
	String color="red";
	
	public void ch05() {
		System.out.println("부모클래스 메소드 p05()");
	}
}
public class test {

	public static void main(String[] args) {
		
		Parent15 p=new Parent15();
		p.p05();
		System.out.println(p.color);
		//p.ch05(); 컴파일 에러 자손 메소드 호출 불가능.
		
		Parent15 p2=new Child15();//업캐스팅
		p2.p05();//업캐스팅 후 오버라이딩 된 메소드 호출. 오버라이딩 없을 시 부모 메소드 호출.
		//p2.ch05(); 컴파일 에러 부모로부터 상속받은 메소드만 호출 가능.
		System.out.println(p2.color);
		
		Child15 ch=new Child15();
		ch.p05();
		ch.ch05();
		System.out.println(ch.color);
		ch=(Child15)p2;//다운캐스팅
		ch.p05();
		ch.ch05();
		System.out.println(ch.color);
	}

}
