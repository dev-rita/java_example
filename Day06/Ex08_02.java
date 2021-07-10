
public class Ex08_02 {

	public static void main(String[] args) {
		// 1부터 10까지 자연수 중에서 반복문을 사용하여 3의 배수를 뺀 누적합을 구해서 출력하자.
		 
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("누적합="+sum);
	
		sum=0;
		int i=0;
		while(i<10) {//i=9이면 밑에 i++문구에서 10이 된다.결과적으로 1~10까지 범위이다.
			i++;//4의 배수가 아니어도 반복하기 위해
			if(i%4==0) {
				continue;
			}
			sum=sum+i;
		}
		System.out.println("누적합="+sum);
	}

}
