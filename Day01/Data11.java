/* 자바의 관계/비교 연산자 종류)
 * >(~보다 크다), >=(~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다)
 */
public class Data11 {

	public static void main(String[] args) {
		
		int a=9, b=3;
		boolean re=false;
		
		re=(a>b);
		System.out.println(a+">"+b+":"+re);
		System.out.printf("%d>%d:%b%n",a,b,re);
		
		re=(a<b);
		System.out.println(a+"<"+b+":"+re);
		System.out.printf("%d<%d:%b%n",a,b,re);
		
		System.out.println((a+b)>(a-b));
		
	}

}
