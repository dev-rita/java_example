class Animal09{
	String name;
	int age;//클래스 소속 멤버변수 2개 선언.
}

class Thing{
	int x;//클래스 소속 멤버변수 1개 선언.
}
public class ObjectEx09 {

	public static void main(String[] args) {
		Animal09 a;//객체주소가 저장 안된 참조 즉 레퍼런스 변수 a.
		a=new Animal09();//객체주소가 저장된 참조 변수 a. 즉 객체명(인스턴스)이라고 함.
		Animal09 b=new Animal09();
		Thing c=new Thing();
		
		a.name="홍길동";
		a.age=26;
		
		System.out.println("이름 :"+a.name);
		System.out.println("나이 :"+a.age);
		
		b.name="펭귄";
		b.age=12;
		
		System.out.println("이름 :"+b.name);
		System.out.println("나이 :"+b.age);
		
		c.x=10;
		System.out.println(c.x);
		
	}

}
