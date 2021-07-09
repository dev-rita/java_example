import java.util.Scanner;

public class SwitchTest12 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.print("0~100사이 점수만 입력>>");
		int score=Integer.parseInt(scan.nextLine());
		char grade=' ';//학점 지정할 변수

		if(score>=0&&score<=100) {
			score=score/10;
			switch(score) {
			case 10: case 9:{
				grade='A';
				break;
			}
			case 8:{
				grade='B';
				break;
			}
			case 7:{
				grade='C';
				break;
			}
			case 6:{
				grade='D';
				break;
			}
			default :{
				grade='F';
			}
			System.out.println(grade+"학점입니다.");
			}
		}else {
			System.out.print("0부터 100사이 점수만 입력하세요!");
		}
	}

}
