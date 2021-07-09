
public class OprTest04 {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		System.out.printf("a=%d, b=%d %n",a,b);
		System.out.printf("a!=0||++b!=0 =%b%n",a!=0||++b!=0);//or연산 앞의 조건이 true이므로 뒷부분은 선행증가를 안함.
		System.out.printf("a=%d, b=%d %n",a,b);
		
		System.out.printf("a==0&&++b!=0 =%b%n",a==0&&++b!=0);//and앞의 조건이 false이므로 뒷부분은 연산수행 안함.
		System.out.printf("a=%d, b=%d %n",a,b);
		
		/* 피연산자 || 피연산자 인 경우, 앞부분 피연산자가 true이면 뒷부분 피연산자가 true or false 이든 참이기 때문에 뒷부분은 연산수행X.
		 * 피연산자 && 피연산자 인 경우, 앞부분 피연산자가 false이면 뒷부분 피연산자가 true or false 이든 참이기 때문에 뒷부분은 연산수행X.
		 */
		
		
	}

}
