
public class ForTest07 {

	public static void main(String[] args) {

		int k=2;
		while(k<=9) {
			System.out.print(k+"단\t");
			k++;
		}
		System.out.println("\n===============================================================");

		//구구단 출력.
		for(int j=1;j<=9;j++) {
			for(int i=2;i<=9;i++) {
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}//inner for
			System.out.println();//줄바꿈
		}//outer for

	}

}
