import java.util.Scanner;

public class Data18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int score=0;
		char grade=' ';

		System.out.print("점수를 입력(0~100)>>");
		score=Integer.parseInt(scan.nextLine());//월을 입력받아서 정수 숫자로 변경

		if(score>=0&&score<=100) {
			switch(score/10)
			{
				case 10: case 9:
				{
					grade='A';
					break;
				}
				case 8: 
				{
					grade='B';
					break;
				}
				case 7: 
				{
					grade='C';
					break;
				}
				case 6: 
				{
					grade='D';
					break;
				}
				default:{
					grade='F';
				}
			}	
			System.out.print("입력하신 점수는 "+score+", 학점은"+grade+" 입니다.");
		}
		else {
			System.out.print("0~100사이만 입력");
		}

	}
}
