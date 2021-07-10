import java.util.Scanner;

public class While12 {

	public static void main(String[] args) {
		
		int input=0,answer=0;
		
		answer=(int)(Math.random()*100)+1;//1~100 사이 임의의 정수 숫자 난수를 발생.
		/* random()은 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생.
		 * 여기서 *100을 하면 0.0 이상 100.0미만이 된다 > (int)로 형 변환 하면 0이상 100미만>
		 * +1을 하면 1이상 101미만 즉 1~100사이 정수 숫자 난수를 구한다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println(answer);
		do {
			System.out.print("1~100 사이의 정수를 입력>>");
			input=Integer.parseInt(scan.nextLine());
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요!");
			}else if(input<answer) {
				System.out.println("더 큰 수를 입력하세요!");
			}
			
		}while(input !=answer);
		
		System.out.println("정답입니다!");
	}

}
