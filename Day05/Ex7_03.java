//1부터 100사이 짝수 한줄에 10개씩 출력 
public class Ex7_03 {

	public static void main(String[] args) {
		for(int i=2;i<=100;i+=2) {
			System.out.print(i+" ");
			if(i%20==0) {
				System.out.println();
			}
		}
	}

}
