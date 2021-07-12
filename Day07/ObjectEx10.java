class Animal10{
	String name;
	private int age;//2개의 멤버변수 선언.
	//private로 정의한 age멤버변수는 Animal10클래스 밖에 영역에서는 접근 못함. (보안성이 좋다)
	
	public void setAge(int new_age) {//new_age는 매개변수
		age=new_age;
	}//set접두어로 시작되는 메소드는 값 저장 메소드이다.
	
	public int getAge() {
		return age;//return 키워드로 age멤버변수값 반환
	}//값 반환 메소드 > get접두어로 시작하면 값 반환 메소드이다.
}
public class ObjectEx10 {

	public static void main(String[] args) {
		//Animal10 a; >>객체주소가 저장 안된 참조변수
		//a=new Animal10() >> 객체주소가 저장된 참조변수 a>>객체명(인스턴스)
		Animal10 a=new Animal10();
		a.name="원숭이";
		//a.age=26; >> public이어야만 허용된다. private로 선언되어 외부클래스에서 접근 못함.
		a.setAge(26);
		System.out.print(a.name);
		//System.out.println(","+age) >> public이어야만 허용된다.
		System.out.println(","+a.getAge());
	}

}
