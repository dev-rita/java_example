import java.util.Scanner;
/* if else if 다중 조건문
 * if(조건식1){
 * 	조건식1이 참이면 실행
 * } else if(조건식 2){
 * 	조건식2가 참이면 실행
 * } else{
 * 	조건식1, 2 모두 거짓일 때 실행.
 * }
 */
public class Data15 {

	public static void main(String[] args) {
		int score=0;//점수를 저장할 변수
		char grade = ' ';//작은따옴표 사이에 한칸 띄어야함
		
		Scanner scan=new Scanner(System.in); //여기서 ctrl+shift+o
		System.out.print("점수를 입력>>");
		String temp=scan.nextLine();//문자열로 입력받는다.
		score=Integer.parseInt(temp);//문자열을 정수 숫자로 변경한다.
		
		if(score>=0 && score<=100) {
			if(score>=90) {
				grade='A';
			}
			else if(score>=80) {
				grade='B';
			}
			else if(score>=70) {
				grade='C';
			}
			else if(score>=60) {
				grade='D';
			}
			else {
				grade='F';
			}
			System.out.print(score+" 점수는"+grade+" 학점 입니다.");
		}
		
		else {
			System.out.println("0부터 100사이 점수만 입력하세요");
		}
		scan.close();
	}
	
}
