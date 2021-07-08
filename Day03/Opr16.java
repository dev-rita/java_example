
public class Opr16 {

	public static void main(String[] args) {
		int a=10;
		int b=4;
		
		System.out.printf("%d + %d =%d\n",a,b,a+b);
		System.out.printf("%d - %d =%d\n",a,b,a-b);
		System.out.printf("%d * %d =%d\n",a,b,a*b);
		System.out.printf("%d / %d =%d\n",a,b,a/b);//정수 숫자를 나눗셈할 때 몫 값.
		System.out.printf("%d / %f =%f\n",a,(float)b,a/(float)b);
		//int/float는 자동산술에 의해서 float/float가 된다. 결국 실수 숫자를 나눗셈 하면 몫을 소수점까지 표현함. 
		//%f는 기본으로 소수점 6자리까지 표현되고 7자리에서 반올림한다.
		
	}

}
