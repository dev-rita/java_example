import java.util.Scanner;
/* 1.import 예약어는 java.util패키지 폴더의 api클래스 스캐너를 읽어들임.
 * 2.외부 패키지 임포트하는 이클립스 단축키는 ctrl+shift+영문자 "o"
 */
public class Data07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/* java.util패키지의 Scanner클래스 특징
		 * 1. 일반문자모드로부터 무엇을 입력받기 위해서 jdk1.5에서 추가됨.
		 * 2. System.in은 키보드 입력장치와 연결됨.
		 */
		
		System.out.print("자기 성, 이름 입력>>");//print()메소드는 출력만하고 줄바꿈은 하지 않는다.
		String name=scan.nextLine();//nextLine()메소드는 문자열을 입력받는다. 자바는 모든 명령어가 대소문자를 구분한다.
		System.out.print("집주소 입력>>");
		String address=scan.nextLine();
		System.out.print("폰번호 입력>>");
		String phone=scan.nextLine();
		
		System.out.println("성, 이름 출력:"+name);
		System.out.println("집주소 출력:"+address);
		System.out.println("폰번호 출력:"+phone);
		
		scan.close(); //close 안해도 되지만(무한 입력 대기상태), 닫아야 메모리 낭비가 없다. 
	}

}
