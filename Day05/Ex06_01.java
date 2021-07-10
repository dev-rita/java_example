import java.util.Scanner;

// 문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복출력하시오.

public class Ex06_01 {

	public static void main(String[] args) {
		String str=" ";
		int num=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("문자를 입력해 주세요 >> ");
		str=scan.nextLine();
		System.out.print("숫자를 입력해 주세요 >> ");
		num=Integer.parseInt(scan.nextLine());
		
		for(int i=0;i<num;i++) {
			System.out.print(str+"/t");//입력받은 숫자만큼 문자 반복출력
		}
	}

}
