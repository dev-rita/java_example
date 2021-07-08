
public class OprEx10 {

	public static void main(String[] args) {
/* 산술(수학) 연산자 종류)
 * +(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)
 * 나눗셈 - 정수 숫자를 나눗셈을 하면 몫만 구하고, 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구함.
 */
		int a=10, b=4;
		int result=0;
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		
		System.out.println(a+"-"+b+"="+(a-b));
		
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		
		result=10%3;
		System.out.println(a+"%"+b+"="+result);
	}

}
