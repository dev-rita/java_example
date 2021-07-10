//1~100사이의 자연수중에서 제일 큰 7의 배수를 구하는 프로그램 작성.
public class Ex08_01 {

	public static void main(String[] args) {
		int num=0,i=0;
		
		for(i=100;i>=1;i--) {
			if(i%7==0) {
				break;
			}
		}
		System.out.println(i);
		
		//break 없이 사용하면 아래와 같다.
		for(i=1;i<=100;i++) {
			if(i%7==0) {
				num=i;
			}
		}System.out.println(num);	
		
	}

}
