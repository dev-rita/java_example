
public class OprEx12 {

	public static void main(String[] args) {
		/* 3항 조건 연산자 형식)
		 * 조건식? 조건식이 참일 때 실행:조건식이 거짓일 때 실행;
		 */
		
		int a=5, b=10;
		int max=(a>b)?a:b;
		System.out.println("max="+max);
		
		int age=26;
		String result=(age>=10&&age<=19)?"10대 입니다.":"10대가 아닙니다.";
		
		System.out.println("당신은"+age+"살이고, "+result);
		
		/* 논리연산자 종류)
		 * 1. &&(and, 논리곱): 입력값 모두 참인 경우만 결과값이 참이다.
		 * 2. ||(or, 논리합): 입력값 모두 거짓인 경우만 결과값이 거짓이다. 입력값 한개라도 참이면 결과값은 참이다.
		 * 3. !(not, 논리부정): 입력값이 참이면 결과값은 거짓이고, 입력값이 거짓이면 결과값은 참이다.
		 */
		
		boolean re=!false;
		System.out.printf("!false : %b %n",re);
		
		char ch='c';
		String s=(ch>='a'&&ch<='z')?"영문소문자":"영문대문자";
		
		System.out.println(ch+"는 "+s);
	}

}
