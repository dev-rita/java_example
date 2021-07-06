/*논리연산자 종류)
 * 1. &&(논리곱:and) > 입력값 모두 참인 경우만 결과값이 참이다.
 * 2. ||(논리합:or) > 피연산자(연산대상: 입력값을 뜻함)가 하나라도 true이면 결과값은 true이다.
 * 3. !(논리부정) > 입력값이 true이면 결과값은 false이고, 입력값이 false이면 결과값은 true이다.
 */
public class Data12 {

	public static void main(String[] args) {
		boolean re=false;
		        re=!false;
		        
		System.out.println("!false = "+re);
		System.out.printf("!false = %b%n",re);
		
		char ch='c';
		String result="";
		
		result=('a' <= ch && ch <= 'z')?"영문소문자":"영문대문자";
		System.out.printf("%c는 %s이다\n",ch,result);
		System.out.println(ch+"는 "+result+"이다");
		
/* 3항조건자 형식)
 * 조건식? 조건식이 참이면 실행 : 조건식이 거짓이면 실행;
 */
	}

}
