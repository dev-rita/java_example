//문제) 이중 for 반복문을 사용하여 다음과 같이 결과가 나오게 한다.
//출력 예.  * * *
//        * * *
//        * * *
public class ForTest08 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print("*\t");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
		
		System.out.println("============================>");
		
//문제) 이중 for 반복문을 사용하여 다음과 같이 결과가 나오게 한다.
//출력 예. *
//       * *
//		 * * *
		for(int i=1;i<=3;i++) {
			for(int j=1;i>=j;j++) {
				System.out.print("*\t");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for
	}

}
