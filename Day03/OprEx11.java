
public class OprEx11 {
	public static void main(String[] args) {
		String a="Java";
		String b="program";
		String c=a+b;//숫자+숫자에서는 +가 덧셈을 한다. 문자+문자에서는 +가 문자열을 서로 연결한다.
		
		System.out.println(c);//문자a+문자b
		String str="결과 값 :";
		int n=20;
		System.out.println(str+n);//문자+숫자에서는 문자를 우선해서 숫자가 문자로 변경된다. 그러므로 문자+문자 즉 서로 연결한다.
		
		/* 비교(관계) 연산자 특징)
		 * 	1. 비교(관계) 연산자의 결과값은 true or false이다. 즉, boolean타입이다.
		 *  2. 비교연산자 종류
		 *  	>(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다)
		 */
		
		int d=10;
		int e=5;
		boolean re=false;
		
		re=(d>e);
		System.out.printf("%d > %d = %b %n",d,e,re);
		
		re=(d<e);
		System.out.printf("%d < %d = %b %n",d,e,re);
		
		System.out.println("first line second line");
	}
}
