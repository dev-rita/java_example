import java.util.Scanner;

public class OprTest07 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		int input=Integer.parseInt(scan.nextLine()); //숫자형 정수만 받아냄.
		//if-else 사용
		if(input%2==0) {
			System.out.print(input+"은 짝수입니다.");
		}
		else {
			System.out.print(input+"은 홀수입니다.");
		}
		
		System.out.println();
		
		//삼항조건연산자 사용.
		String result ;
		result= input%2==0? "짝수":"홀수";
		System.out.print(input+"은 "+result+"입니다.");
		
	}
}
