//이중 포문을 사용하여 다음과 같이 출력되게 한다.
/* 출력 예>* * *
 *        * * *
 *        * * *
 *        
 * 출력 예>*
 * 		 * *
 * 		 * * *
 */
public class ForTest15 {

	public static void main(String[] args) {

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=====================");
		for(int i=0;i<3;i++) {
			for(int j=0;j<=i;j++) {//j=2;j<=4-i;j++ 로 하면 반대.
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
