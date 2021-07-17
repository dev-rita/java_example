//String 클래스는 자손이 없다.(final로 지정)>> 보안때문
public class StringEquals18 {

	public static void main(String[] args) {
		String str01=new String("Java");
		String str02=new String("Java");//str01과 str02는 다른 객체주소를 가진다.
		
		if(str01==str02) {//주소값을 비교
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(str01.equals(str02)) {
			System.out.println("내용물이 같다.");
		}else {
			System.out.println("다르다");
		}
		
		String str03="oracle"; //문자열이 같을 때 new가 없으면 str03문자열 상수영역을 str04문자열 상수영역이 똑같이 가리킨다.
		String str04="oracle"; //str03과 str04는 같은 주소를 가리킨다. (new로 해야 새로운 객체주소를 가짐.)
		
		if(str03==str04) {//주소값을 비교
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(str03.equals(str04)) {
			System.out.println("내용물이 같다.");
		}else {
			System.out.println("다르다");
		}
	}

}
