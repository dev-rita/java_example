import java.util.Scanner;

public class IfTest15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 하나를 입력>>");
		int input=Integer.parseInt(scan.nextLine());
		
		if(input==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}else {
			System.out.println("입력한 숫자는 0이 아닙니다.");
		}
	}

}
