import java.util.Scanner;

public class SwitchTest19 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("0~100 사이 정수 입력>>");
		int score=Integer.parseInt(scan.nextLine());
		char grade=' ';
		
		if(score>=0&&score<=100) {
			switch(score) {
			case 100: case 99: case 98: case 97: case 96:
			case 95: case 94: case 93: case 92: case 91:
			case 90: grade='A'; break;
			
			case 80: case 89: case 88: case 87: case 86:
			case 85: case 84: case 83: case 82: case 81:
			case 70: grade='B'; break;
			
			default : grade='F'; break;
			}
			System.out.print(score+"점수는 "+grade+"입니다.");
		}else {
			System.out.println("0~100사이 정수를 입력하세요!");
		}
	}

}
