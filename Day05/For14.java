
public class For14 {

	public static void main(String[] args) {
		int i, a;//반복문 제어변수
		System.out.println("시침 ----------->분침");
		System.out.println("a(바깥반복문 제어변수) --> i(안쪽반복문 제어변수)");
		for(a=1;a<=5;a++){
			for(i=1;i<=5;i++) {
				System.out.println(a+"-------->"+i);
			}
			System.out.println("\n==================>");

		for(int dan=2;dan<=9;dan++) {
			System.out.println("**"+dan+"단**");
			for(int n=1;n<=9;n++) {
				System.out.println(dan+"x"+n+"="+(dan*n));
			}
			System.out.println("\n==================>");
		}
		}
	}

}
