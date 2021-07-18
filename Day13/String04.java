
public class String04 {

	public static void main(String[] args) {
		String str01="abc";
		String str02="abc";//str01과 str02는 같은 주소를 가리킨다.(문자열이 같기 때문. new로 하면 다른 주소)
		String str03="efg";
		
		System.out.println("str01==str02>>"+(str01==str02));
		System.out.println("str01==str03>>"+(str01==str03));//문자열을 ==로 비교하면 주소값을 비교한다.
		System.out.println("str01.equals(str02)>>"+str01.equals(str02));
		System.out.println("str01.equals(str03)>>"+str01.equals(str03));
		//equals()메소드를 사용하면 내용 문자값만 비교. 실제 프로그램 개발에서 사용해야 할 코드.
		
		String str04=new String("abc");
		String str05=new String("abc");//new로 새로운 객체명을 생성하면 각각 다른 주소값을 가진다.
		
		System.out.println("str04==str05>>"+(str04==str05));
		System.out.println("str04.equals(str05)>>"+str04.equals(str05));
	}

}
