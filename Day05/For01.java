
public class For01 {
/*명확한 반복횟수가 정해진 경우는 되도록이면 for 반복문을 이용한다.
 * for 반복문 형식)
 * for(초기치;조건식;증감식){
 * 	조건식이 참일동안만 반복수행;
 * }
 */
	public static void main(String[] args) {
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		
		System.out.println("\n for 반복문 형식");
		
		for(int i=1;i<=5;i++) {
			System.out.print("Hello \t");
		}
		
		System.out.println("\n ---------------------------------");
		
		for(int i=2;i<=10;i+=2) { //i+=2는 복합 대입연산자로 풀어서 i=i+2 즉 2씩 증가
			System.out.print(i+"\t");
		}
		
		System.out.println("\n ---------------------------------");
		
		for(int i=5;i>=1;i--) {
			System.out.print(i+"\t");
		}
		
	}

}
