import java.util.Scanner;

public class SwitchTest11 {

	public static void main(String[] args) {
/* switch ~ case 다중조건문(선택문) 형식:
 * 	switch(정수식){
 * 		case 값 : 정수식과 값이 일치하면 실행; break;
 * 		...
 * 		default : 해당사항 없을 때 실행;
 * } 
 * 	break문을 만나면 switch~case 다중선택문을 종료한다.
 */
		Scanner scan=new Scanner(System.in);
		System.out.print("권리자 권한등급 입력 (1~3)>>");
		int grade=Integer.parseInt(scan.nextLine());
		
		if(1<=grade && grade<=3) {
		switch(grade) {
		case 1: System.out.println("최고 관리자");     //관리자 회원제 등급권한 분기문에서 많이 활용함.
		case 2: System.out.println("중간 관리자");
		case 3: System.out.println("사용자");
		} // break문이 없으면 switch ~ case문 중단 못함.
	}else {
		System.out.println("1~3사이 권한등급만 입력하세요!");
	}
	}

}
