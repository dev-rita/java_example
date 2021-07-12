import java.util.Scanner;

public class MethodEx08 {
	
	static int abs(int data) {
		if(data<0) {
			data=-data;
		}
		return data;//return 예약어는 메서드를 호출한 곳으로 결과값(return value)을 반환한다.
		//return값은 단 하나의 값만 반환된다.
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	
		System.out.print("음의정수만 입력>>");
		int number=Integer.parseInt(scan.nextLine());
		
		int result=abs(number);
		System.out.println(number+"의 절대 값 ="+result);
		
	}

}
