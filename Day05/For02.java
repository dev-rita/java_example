import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		int i;
		
		for(i=1;i<=10;i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println("==============");
		int a=9;
		System.out.println("<<==========="+a+"단===============>");
		for(i=1;i<=9;i++) {
			System.out.println(a+" x "+i+"= "+(a*i));
		}
		System.out.println("==============");
		
		//스캐너를 사용해 입력한 수에 대한 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요>>");
		int dan = Integer.parseInt(scan.nextLine());
		
		for(i=1;i<=9;i++) {
			System.out.println(dan+" x "+i+"= "+(dan*i));
		}
		
	}

}
