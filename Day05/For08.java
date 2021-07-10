import java.util.Scanner;

public class For08 {

	public static void main(String[] args) {
		/*스캐너를 사용해서 줄 수, 라인수를 입력받아 이중for문을 사용해서 다음과 같이 출력해본다.
		 * 출력예) 4를 입력하면 아래와 같이 출력
		 *  	 *
		 * 		 * *
		 *       * * *
		 *       * * * *
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("라인 입력>>");
		int line=Integer.parseInt(scan.nextLine());

		for(int i=0;i<line;i++) {
			for(int j=0;j<=i;j++){
				System.out.print("*\t");
			}//inner
			System.out.println();
		}//outer
	
		/*이중 for문을 사용해서 구구단을 구해보자
		 * 2단
		 * 2x1=2
		 * ...
		 * 2x9=18
		 * 3단
		 */
		
		for(int i=2;i<=9;i++) {
			System.out.println(i+"단");
			for(int j=1;j<=9;j++){
				System.out.print(i+"x"+j+"="+(i*j)+"\n");
			}//inner
			System.out.println();
		}//outer
	}
}
