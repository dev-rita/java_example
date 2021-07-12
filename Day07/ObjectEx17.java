class MyMath17{
	int add(int a,int b) {
		return a+b;//return에 의해서 메서드를 호출한 곳으로 결과값을 반환한다.
	}
	int subtract(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		int result=a*b;
		return result;
	}
}
public class ObjectEx17 {
	public static void main(String[] args) {

		MyMath17 my=new MyMath17();
		
		int re01=my.add(10,5);
		System.out.println("10+5="+re01);
		
		re01=my.subtract(10,3);
		System.out.println("10-3="+re01);
		
		re01=my.mul(10,5);
		System.out.println("10 x 5 = "+re01);
	}
}
