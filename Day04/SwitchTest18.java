import java.util.Scanner;

public class SwitchTest18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("주민번호 입력(XXXXXX-XXXXXXX):");
		String jumin=scan.nextLine();
		char gender=jumin.charAt(7);//첫문자를 0부터 시작해서 8 번째 두번째 주민번호 첫자리 단일문자를 구함.
		
		switch(gender) {
		case '1': case '3': System.out.println("당신은 남자입니다."); break;
		case '2': case '4': System.out.println("당신은 여자입니다."); break;
		default : System.out.println("유효하지 않은 주민등록번호입니다.");
		}
		
	}

}
