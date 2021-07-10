
public class for10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}

		System.out.println("---------------------");

		//이중 for문, if문, printf()출력 형태 지시자를 활용해서 다음과 같이 출력되게 만들자.
		/* [1,1]
		 * 		[2,2]
		 * 			 [3,3]
		 * 				  [4,4]
		 * 					   [5,5]
		 */

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);}
				else {
					System.out.print("\t");}//System.out.printf("%5c",' ');총 5자리 표현, 오른쪽 정렬
			}//inner
			System.out.println();
		}//outer

	}
}
