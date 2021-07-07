/*do~ while 반복문 형식)
 * do{
 *    조건식이 참일동안만 반복 실행;
 *    증감식;}while(조건식);
 * 이 반복문은 조건식이 나중에 나오기 때문에 while반복문과는 다르게 조건식이 거짓이라도 한번은 반복된다.
 */
public class DoWhileTest06 {

	public static void main(String[] args) {
		
		int i=9;
		do {
				System.out.print(i+" ");
				i-=2;
		}while(i>=1);
		System.out.println();//줄바꿈
		
		i=2;
		do {
				System.out.print(i+" ");
				i+=2;
		}while(i<=10);
		System.out.println();
		
		i=10;
		do {
				System.out.print(i+" ");
				i++;//11
		}while(i<10); // 11<10 비교연산은 거짓. 나중에 조건을 검사하기 때문에 한번 반복한다.
		              // 원하지 않는 값이 출력될 위험이 있다. 이 반복문을 사용할 때는 주의해서 사용해야한다.
		System.out.println();
		
	}

}
