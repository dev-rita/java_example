import java.util.Scanner;

public class While11 {
	public static void main(String[] args) {
		int num=0, sum=0;
		boolean flag=true;//while 반복문 조건식에 사용할 변수.

		System.out.print("합계를 구할 숫자 입력(끝내려면 0)  ");

		while(flag) {
			System.out.print(">> ");
			Scanner scan=new Scanner(System.in);
			num=Integer.parseInt(scan.nextLine());

			if(num!=0) {
				sum+=num;
			}else {
				flag=false;
			}
		}//flag가 false가 될 때까지 무한루프
		System.out.println("합계="+sum);
		
	}
}