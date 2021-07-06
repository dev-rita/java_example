import java.util.Scanner;

public class Data17 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int month=0;
		System.out.print("월을 입력>>");
		month=Integer.parseInt(scan.nextLine());//월을 입력받아서 정수 숫자로 변경
		
		if(month>=1&&month<=12) {
			System.out.printf("입력하신 %d월은 ",month);
			//문제) if else if 다중 조건문과 ||(논리합 즉 or) 논리연산을 활용하여
			//봄,여름,가을,겨울이 출력되는 문장 만들기
			if(month==3||month==4||month==5)
			{System.out.println("봄입니다.");}
			else if(month==6||month==7||month==8)
			{System.out.println("여름입니다.");}
			else if(month==9||month==10||month==11)
			{System.out.println("가을입니다.");}
			else //== else if(month==12||month==1||month==2)
			{System.out.println("겨울입니다.");}
		}
		else {
			System.out.print("1월~12월 사이만 입력");
		}
	}
}
