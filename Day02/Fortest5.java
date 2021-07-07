
public class Fortest5 {

	public static void main(String[] args) {
		int sum=0; //누적합
		int i; //반복문 제어변수
		
		for(i=2;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("짝수들의 누적합 ="+sum);
		
		sum=0;
		for(i=1;i<=10;i+=2) {
			sum+=i;
		}
		System.out.println("홀수들의 누적합 ="+sum);
	}

}
