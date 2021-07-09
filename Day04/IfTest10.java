import java.util.Scanner;

public class IfTest10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력(0~100사이 점수만 입력)>>");
		int score=Integer.parseInt(scan.nextLine());
		char grade=' ';
		
		System.out.print(score+"점수는 ");
		if(score>=0&&score<=100) {
			if (score>=90) {
				grade='A';
			}else if(score>=80) {
				grade='B';
			}else if(score>=70) {
				grade='C';
			}else if(score>=60) {
				grade='D';
			}else {
				grade='F';
			}
			System.out.print(grade+"학점입니다.");
		}else {
			System.out.println("0~100사이 점수만 입력");
		}
	}

}
