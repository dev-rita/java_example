//1~100까지의 합을 10단위로 출력
public class Ex7_02 {

	public static void main(String[] args) {
		
		int sum=0;		
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%10==0) {
				System.out.printf("1~"+i+"까지의 합:"+sum+"\n");
			}
		}
		
	}

}
