
public class ForTest02 {

	public static void main(String[] args) {
		int i;//반복문 제어변수
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");//줄바꿈 하지 않고 1 2 3 4 5
		}
		System.out.println();//줄바꿈

		for(i=5;i>=1;i--) {
			System.out.print(i+" ");//줄바꿈 하지 않고 5 4 3 2 1
		}
		System.out.println();//줄바꿈

		for(i=1;i<=10;i=i+2) {
			System.out.print(i+" ");//줄바꿈 하지 않고 1 3 5 7 9
		}
		System.out.println();//줄바꿈

		for(i=2;i<=10;i=i+2) { //i+=2 복합대입연산자
			System.out.print(i+" ");//줄바꿈 하지 않고 2 4 6 8 10
		}
		System.out.println();//줄바꿈
	}

}
