/* continue 문)
 * 반복문 내에서 이 문을 만나면 아래문장을 실행하지 않고 반복문 처음으로 돌아가서 다음 반복을 계속한다.
 */
public class ContinueTest10 {
	public static void main(String[] args) {
		int i;

		for(i=1;i<=10;i++) {
			if(i%4==0) {//4의 배수 pass
				continue;
			}
			System.out.print(i+" ");
		}//for
		System.out.println();

		// 1부터 10까지 10번 반복하는 for 반복문에서 3의 배수 누적합을 구하시오.

		int total=0;
		for(i=1;i<=10;i++) {
			if(i%3==0) {//3의 배수일 때만 
				total+=i;
			}
		}//for
		System.out.println("3의 배수 누적합: "+total);	

		total=0;
		for(i=1;i<=10;i++) {
			if(i%3!=0) {//3의 배수가 아니면 pass
				continue;
			}
			total+=i;
		}//for
		System.out.println("3의 배수 누적합: "+total);

		//for 반복문, if조건문, continue문을 사용해서 1부터 10까지 10번 반복하며,그 중 4의배수를 뺀 누적합을 출력하자.
		total=0;
		for(i=1;i<=10;i++) {
			if(i%4==0) {//4의 배수는 pass
				continue;
			}
			total+=i;
		}
		System.out.println("4의 배수를 뺀 누적합: "+total);

		//while반복문, if else if 다중 조건문과 나머지 연산을 활용해서 1부터 10까지 10번 반복하며,
		//2의배수 누적합, 3의배수 누적합, 5의배수 누적합을 각각 구해서 출력하자.
		i=1;
		total=0;
		int total2=0,total3=0;
		while(i<=10) {

			if(i%2==0){ 
				total+=i; 
				if(i%3==0)//2의 배수면서 3의 배수인 값
				{
					total2+=i;
				}
				else if(i%5==0)//2의 배수면서 5의 배수인 값
				{
					total3+=i;
				}
			}


			else if(i%3==0) {
				total2+=i;
			}

			else if (i%5==0) {
				total3+=i;	}
			i++;

		}
		System.out.println("2의 배수 누적합: "+total+"\n3의 배수 누적합: "+total2+"\n5의배수 누적합: "+total3);

	}
}//main


