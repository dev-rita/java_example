import java.util.Scanner;

/* 간결한 문장에서 활용하고 빠른 실행을 원할 때 사용하는 다중 선택문인 switch ~case문
 * swith에서는 논리 및 비교연산을 사용할 수 없어 속도가 빠르다. (간결한 문장)
 * switch(정수식){
 * 	case 값 : 정수식과 값이 일치하면 실행; break; 로 빠져나간다.
 *  중략.
 *  default:처리할 문장;
 * }
 * 정수식과 case문의 값이 일치하면 해당 실행문장을 처리한다. 그리고 break문을 만나면 switch~case문을 종류한다.
 * default문은 해당조건이 없을 때 실행한다.
 */

public class Data16 {

	public static void main(String[] args) {
		//이클립스에서 ctrl+A로 전체 선택하고 Ctrl+I를 입력하면 자동정렬된다.
		Scanner scan=new Scanner(System.in);
		int month=0; //월을 지정할 변수
		System.out.print("현재 월을 입력(1~12):");
		String tmp=scan.nextLine();
		month=Integer.parseInt(tmp); //입력받은 문자열을 정수 숫자로 변경한다.

		if(month>=1&&month<=12) {
			System.out.printf("입력하신 %d월은 ",month);
			switch(month){
			case 3: case 4: case 5:
			{System.out.println("봄입니다.");
			break;}

			case 6: case 7: case 8:
			{System.out.println("여름입니다.");
			break;}

			case 9: case 10: case 11:
			{System.out.println("가을입니다.");
			break;}

			default://case 12: case 1: case 2:
			{System.out.println("겨울입니다.");
			}//default 에는 break문이 필요 없다.
			}
		}
		else {
			System.out.println("1~12월 사이로 입력하세요.");
		}
		scan.close();}

}
