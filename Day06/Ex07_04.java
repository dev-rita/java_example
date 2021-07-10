
public class Ex07_04 {

	public static void main(String[] args) {
		/* 이중 for문와 while반복문을 사용하여 다음과 같이 구구단을 출력되게 한다.
		 *  2단    3단    4단 .... 9단
		 *  2x1=2 3x1=3 4x1=4    9x1=9
		 */
		
		int k=2;

		while(k<=9) {
			System.out.print(k+"단\t");
			k++;}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}

	}

}
