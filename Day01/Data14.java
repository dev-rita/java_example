/*if(조건식){
 * 조건식이 참이면 실행;
 * }
 */
import java.util.Scanner;

public class Data14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 숫자 입력>>");
		int number=Integer.parseInt(scan.nextLine());//문자열로 입력받은 것을 숫자로 변경
		//여기서 만약 문자열"aa"를 입력하면 parseInt()메소드에 의해서 정수 숫자로 변경 못해서 예외 오류 발생.
		//"aa"를 ""빼도 aa이다. "7"은 7로 변경되어도 정수숫자로 변경할 수 있다.
		if (number==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if (number !=0) //!=같지않다. 또는 if(number !=0) 부분을 else로 대체해도 됨.
			{
				System.out.println("입력하신 숫자는 0이 아닙니다.");
			}
		
		/* 문제) 위의 두개의 if문을 if else문으로 변경해 보세요.
		 */
		scan.close();
	}
}
