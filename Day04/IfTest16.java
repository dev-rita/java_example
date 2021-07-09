import java.util.Scanner;

public class IfTest16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char grade = ' ';
		char opt = ' ';//+,-,0
		System.out.print("점수를 입력하세요>>");
		int score=Integer.parseInt(scan.nextLine());

		if(score>=0&&score<=100) {
			System.out.print("당신의 점수는 ");
			if(score>=90) {
				grade='A';
				if(score>=98) opt='+';
				else if(score<94) opt='-';
				else opt='0'; 
			}

			else if(score>=80) {
				grade='B';
				if(score>=88) opt='+';
				else if(score<84) opt='-';
				else opt='0'; 
			}

			else if(score>=70) {
				grade='C';
				if(score>=78) opt='+';
				else if(score<74) opt='-';
				else opt='0'; 
			}

			else if(score>=60) {
				grade='D';
				if(score>=68) opt='+';
				else if(score<64) opt='-';
				else opt='0'; 
			}

			else {
				grade='F';
			}
			System.out.println(score+"점이고, "+grade+opt+"입니다.");
		}else {
			System.out.println("0부터 100까지 점수만 입력하세요!");
		}

	}

}
