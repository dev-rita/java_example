
public class Break06 {

	public static void main(String[] args) {
		// while 무한루프문, if 조건문, break문을 사용하여 누적합이 100을 초과하는 숫자를 구해보자.

		int sum=0, i=1;

		while(true) {
			sum+=i;
			if(sum>100) {
				System.out.println("누적합이 100 초과하는 숫자는="+i);
				break;
			}
			i++;
		}

		System.out.println();

		while(true) {
			if(sum>100) {
				break;
			}
			i++;
			sum+=i;
		}
		System.out.println("누적합이 100 초과하는 숫자는="+i);


		//for, if, continue문을 사용해서 1~10까지의 자연수 중에서 4의 배수를 뺀 누적합 구해보자.

		sum=0;
		for(i=1;i<=10;i++) {
			if(i%4==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("1~10까지 4의배수를 뺀 누적합="+sum);
	}
}
