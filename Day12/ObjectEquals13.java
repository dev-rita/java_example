
public class ObjectEquals13 {

	public static void main(String[] args) {
		int a=10, b=10;

		if(a==b) {//기본타입 값을 ==로 비교하면 값만 비교한다.
			System.out.println(a+"와"+b+"는 같다.");
		}else {
			System.out.println(a+"와"+b+"는 같지않다.");
		}

		String pwd01=new String("5678");//String 클래스의 pwd01을 새로운 객체로 생성.
		//java.lang package에 해당 String 클래스가 존재함.
		String pwd02=new String("5678");//pwd01과 pwd02는 각 객체주소가 다르다.

		if(pwd01==pwd02) {//문자열 참조타입을 ==로 비교하면 주소값을 비교한다.
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다");
		}

		if(pwd01.equals(pwd02)) {//String오버라이딩 된 equals()메소드를 사용하면 문자열 값만 비교한다.
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다");
		}

		String d="5678";
		String e="5678";
		if(d==e) {//문자열 참조타입을 ==로 비교하면 주소값을 비교한다.
			System.out.println("비번이 같다");
		}else {
			System.out.println("비번이 다르다");
		}

		String str01=new String("1234");
		String str02=str01;//str02에 str01주소값을 대입해서 같은 주소를 가리킨다.

		if(str01==str02) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다");
		}
	}

}
