
public class While05 {

	public static void main(String[] args) {
		/*While 반복문 형식)
		 * while(조건식){
		 * 조건식이 참일동안만 반복;
		 * 증감식;
		 * }
		 */

		int i=1;
		while(i<=3) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n=======================");

		i=3;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println("\n=======================");
		
		i=2;
		int total=0;//짝수들의 누적합
		while(i<=10) {
			total+=i;
			i+=2;
		}
		System.out.println("짝수들의 누적합="+total);
		
	}

}
