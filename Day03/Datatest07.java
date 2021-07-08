import java.util.Scanner;

public class Datatest07 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		/*java.util패키지의 Scanner 클래스 특징)
		 * 1.jdk 1.5에서 추가 됨. 일반 문자모드에서 무엇을 입력받기 위해서 사용 함.
		 * 2.System.in은 키보드 입력장치와 연결 됨.
		 */
		
		System.out.print("나이를 입력>>");
		int age=Integer.parseInt(scan.nextLine()); //입력받아서 정수 숫자로 변경
		System.out.print("이름 입력>>");
		String name=scan.nextLine();
		
		System.out.println("나이 : "+age+"\n 이름 :"+name);
	}

}
