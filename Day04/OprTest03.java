import java.util.Scanner;

public class OprTest03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=' ';
		System.out.print("문자 하나 입력 >>");
		String input=scan.nextLine();
		ch=input.charAt(0);//charAt(0)메소드는 입력문자에서 첫 단일문자를 구함.

		if('0'<=ch&&ch<='9') {
			System.out.println("입력하신 문자는 숫자이다.");
		}
		if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')) {
			System.out.println("입력하신 문자는 영문자이다.");
		}

	}

}
