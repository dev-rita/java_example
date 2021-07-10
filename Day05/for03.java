import java.util.Scanner;

public class for03 {

	public static void main(String[] args) {
		//스캐너를 사용해서 입력한 문자 '#'을 입력한 반복횟수만큼 반복하는 코드를 완성하자
		
		Scanner scan=new Scanner(System.in);
		System.out.print("반복횟수를 입력하세요>>");
		int num=Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<num;i++) {
			System.out.print('#');
		}
		
		System.out.println("===============================");
		
		System.out.print("반복횟수를 문자를 입력하세요>>");
		String ch=scan.nextLine();
		System.out.print("반복횟수를 입력하세요>>");
		int num2=Integer.parseInt(scan.nextLine());
		
		
		for(int j=1;j<=num2;j++) {
			System.out.print(ch);
		}
		
	}

}
