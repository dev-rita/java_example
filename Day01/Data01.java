/* 한줄 이상 주석문이다. 주석문이란 소스에 대한 설명문 즉 comment로서 실행되지 않는다.
 * 1. public 접근권한 제어자는 누구나 다 접근가능하게 한다.
 * 2. class 예약어(=키워드:약속된 명령문)로 클래스 명을 정의한다.
 */
public class Data01 {
	public static void main(String[] args) {
		System.out.println(100);//한 줄 주석문기호, System.out은 모니터 출력장치와 연결됨.
		                        //print는 출력, ln은 줄바꿈 즉 개행한다.
		System.out.println(10.5);//세미콜론(;)은 한문장 끝을 의미한다.
		System.out.println('a');//자바언어는 대소문자를 구분한다. 'a'는 char타입으로 십진수 정수 97로 저장.
		System.out.println(true);//true는 기본자료형에서 boolean타입으로 참을 뜻한다.
		System.out.println(10L);//정수 상수 뒤에 접미사 l 또는 L이 붙으면 8바이트 long타입 정수값이다.
		System.out.println(10.3f);//실수 숫자 값 뒤에 접미사 f 또는 F가 붙으면 4바이트 float타입 실수값이다.
		System.out.println("파 이 팅");//""로 묶인 값은 레퍼런스 참조타입 즉 문자열 클래스형이다.
	}

}
