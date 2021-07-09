import java.util.Scanner;

public class SwitchTest20 { //이중 switch문, 잘쓰이진 않음.

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("주민번호 입력(XXXXXX-XXXXXXX)>>");
		String jumin=scan.nextLine();
		char gender=jumin.charAt(7);//주민번호 두 번째 첫자리를 구함.
		
		System.out.print("입력한 주민번호는 "+jumin+"이고, ");
		switch(gender) {
		case '1': case '3': 
			switch(gender) {
			case '1': System.out.print("2000년 이전에 태어난 남자다.");break;
			case '3': System.out.print("2000년 이후에 태어난 남자다.");break;
			}
			break;
			
		case '2': case '4':
			switch(gender) {
			case '2': System.out.print("2000년 이전에 태어난 여자다.");break;
			case '4': System.out.print("2000년 이후에 태어난 여자다.");break;
			}
			break;
		default : System.out.println("유효하지 않은 주민번호 입니다.");
		}
	}

}
