
public class Data10 {

	public static void main(String[] args) {
		int x=8;
		int y=4;
		int result=0;
		
		result=x+y;
		System.out.printf("%d + %d = %d %n",x,y,result);
		System.out.println(x+" + "+y+" = "+result);
		
		result=x-y;
		System.out.printf("%d - %d = %d %n",x,y,result);
		System.out.println(x+" - "+y+" = "+result);
		
		result=x*y;
		System.out.printf("%d * %d = %d %n",x,y,result);
		System.out.println(x+" * "+y+" = "+result);
		
		result=x/y;
		System.out.printf("%d / %d = %d %n",x,y,result);
		System.out.println(x+" / "+y+" = "+result);

		
		System.out.println(10/4.0f); //int/float>float/float>10.0f/4.0f>2.5f
		                             //실수 숫자를 나눗셈하면 몫과 나머지를 함께 구한다.
		
		result=10%3;
		System.out.println("10%3="+result);
		
	}

}
