
public class DataTest06 {

	public static void main(String[] args) {
/* printf()메소드에서 사용하는 다양한 출력형태 지시자 종류
 * 1. %b : boolean타입
   2. %d : 10진수 정수 숫자 형태
   3. %o : 8진수 정수 숫자 형태
   4. %x, %X : 16진수 정수 숫자 형태
   5. %f : 10진수 실수 숫자 형태
   6. %c : 단일문자 
   2. %s : 문자열
 */
		byte a=1;
		short b=2;
		char c='A';
		int d=10;
		
		System.out.printf("a=%d %nb=%d %nc=%c&%d %nd=%d", a,b,c,(int)c,d);
		System.out.printf("[%5d] %n", d);//%5d는 기본 오른쪽 정렬이고 다섯자리 정수 숫자를 표현. 빈자리는 공백으로 표현.
		System.out.printf("[%-5d] %n", d);//%-5d는 기본 왼쪽 정렬이고 다섯자리 정수 숫자를 표현. 빈자리는 공백으로 표현.
		System.out.printf("[%05d] %n", d);//%05d는 기본 오른쪽 정렬이고 다섯자리 정수 숫자를 표현. 빈자리는 0으로 표현.
	}

}
