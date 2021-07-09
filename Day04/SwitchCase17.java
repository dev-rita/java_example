import java.util.Scanner;

public class SwitchCase17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("현재 월 입력>>");
		int month=Integer.parseInt(scan.nextLine());
		
		if(month>=1 && month<=12) {
			 System.out.print(month+"월은 ");
			 String season=" ";
			 //switch 조건에는 정수식만 들어간다. (비교연산은 X)
			 switch(month) {
			 case 3: case 4: case 5: season="봄"; break;
			 case 6: case 7: case 8: season="여름"; break;
			 case 9: case 10: case 11: season="가을"; break;
			 default : season="겨울"; break;
			 }
			 System.out.print(season+"입니다.\n");
			 
			 //switch문을 if~else if 문으로 변경.
			 season=" ";
			 System.out.print(month+"월은 ");
			 if (month==3||month==4||month==5) season="봄";
			 else if (month==6||month==7||month==8) season="여름";
			 else if (month==9||month==10||month==11) season="가을";
			 else season="겨울";
			 System.out.print(season+"입니다.");
		}
		
		else {
			System.out.println("1~12사이 월만 입력하세요");
		}
	}

}
