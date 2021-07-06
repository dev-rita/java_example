
public class Data05 {

	public static void main(String[] args) {
		/*printf()메서드 특징
		 * 1. 다양한 출력형태를 지정해서 출력하고자 jdk 1.5버전에서 추가되었다.
		 * 2. 출력형태 지시자 종류
		 *    %c : 단일문자 / %d : 십진수 정수 숫자 / %s : 문자열 형태 / %b : boolean형태
		 *    %o : 8진수 정수 / %x(%X) : 16진수 정수 / %f : 10진수 실수 / %e(%E) : 지수형태*/
		char x;
		x='A';
		System.out.printf("%c -> %d, %o %n",x,(int)x,(int)x); //'A'는 십진수 정수값 65
		                                           //\n: 확장 특수 문자, 줄바꿈 %n: 줄바꿈
		
		x='0';
		System.out.printf("%c -> %d %n",x,(int)x);//'0'은 십진수 정수값 48
		
		x='a';
		System.out.printf("%c -> %d %n",x,(int)x);//'a'는 십진수 정수값 97
		
		String y;//레퍼런스 참조 타입 문자열 > 클래스형에 해당됨.
		y="AB";
		System.out.println(y);
	}

}
