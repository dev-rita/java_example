
public class TwoArray01 {

	public static void main(String[] args) {
		int[][] score=new int[3][2];//3행*2열의 2차원 배열을 생성. 3*2= 총 6개의 배열원소값을 저장할 수 있다.
		//첫 번째의 3은 행의 개수, 두 번째 2는 열의 개수.
		
		int row, col;//반복문 제어변수
		
		//2차원 배열원소값 초기화
		score[0][0]=100; score[0][1]=90;
		score[1][0]=95; score[1][1]=100;
		score[2][0]=90; score[2][1]=90;
		
		//2중 for반복문으로 이차원 배열 원소 값을 출력
		for(row=0;row<3;row++) {
			for(col=0;col<2;col++) {
				System.out.print(score[row][col]+" ");
			}
			System.out.println();//줄 바꿈
		}
	}

}
