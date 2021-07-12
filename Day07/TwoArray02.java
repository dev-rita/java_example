
public class TwoArray02 {

	public static void main(String[] args) {
		int [][]score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};//4행*3열의 2차원 배열 원소값 초기화. 총 12개의 배열 원소값이 저장됨.

		int sum=0;

		//일반 이중 for반복문으로 배열의 값을 출력.
		for(int i=0;i<score.length;i++) {//score.length는 이차원 배열의 행의 개수 즉 4를 반환.
			for(int j=0;j<score[i].length;j++){//score[i].lenth는 각 행의 열의 개수를 반환
				System.out.printf("score[%d][%d]=%d %n",i,j,score[i][j]);
			}
		}
		System.out.println("\n =========================>");

		// 향상된 확장 for반복문으로 이차원배열원소값의 총합
		for(int []arr:score) {//먼저 2차원 배열을 1차원 배열 arr변경.
			for(int k :arr) {//1차원 배열을 일반변수로 변경
				sum=sum+k;
			}		
		}System.out.println("합계 ="+sum);
		//2차원 배열을 1차원 배열로 변경 (0행에 대한 배열, 1행에 대한 배열, 2행에 대한 배열, 3행에 대한 배열)
		//>> 1차원 배열을 일반변수로 변경(각 행에 대한 변수들을 출력)
	}
}
