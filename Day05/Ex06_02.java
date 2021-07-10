import java.util.Scanner;

//1부터 입력받은 값까지의 홀수 출력하는 프로그램을 작성하시오
public class Ex06_02 {

	public static void main(String[] args) {
		int num=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("값을 입력하세요 >>");
		num=Integer.parseInt(scan.nextLine());
		for(int i=1;i<=num;i++) {
			if(i%2==1) {
				System.out.print(i+"\n");
			}
		}
		System.out.println("===============================");
		for(int i=1;i<=num;i+=2) {
				System.out.print(i+"\n");
		}
	}

}
