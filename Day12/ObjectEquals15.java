class Person{//extends Object
	long id;

	Person(){}
	Person(long id){
		this.id=id;
	}//생성자 오버로딩 >> 오버라이딩은 되지 않는다. 상속이 되지 않기 때문.

	public boolean equals(Object obj) {//Object obj= p02 >> 업캐스팅.
		if(obj != null && obj instanceof Person) {//instanceof 연산자는 형변환 유무 판단 연산자이다.
			return id==((Person)obj).id;//명시적인 다운캐스팅 하고 값만 비교
		}else {
			return false;
		}
	}
}
public class ObjectEquals15 {

	public static void main(String[] args) {
		Person p01=new Person(8011081111122L);
		Person p02=new Person(8011081111122L);

		if(p01==p02) {//주소값을 비교
			System.out.println("p01과 p02는 같은 주소이다.");
		}else {
			System.out.println("p01과 p02는 다른 주소이다.");
		}

		if(p01.equals(p02)) {
			System.out.println("같은 주민번호이다.");
		}else {
			System.out.println("다른 주민번호이다.");
		}
	}
}
