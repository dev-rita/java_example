
public class TwoArray04 {

	public static void main(String[] args) {
		/* 가변 배열 즉 래그드 배열 특징>
		 * 1. 2차원 이상의 배열을 생성할 때 행은 고정시키고 각 행의 열의 개수를 지정하지 않고 유동적으로 변화를 주는 가변 배열.
		 *    추후에 각 행의 열의 길이를 다르게 생성한다.
		 * 2. 가변 배열 생성 형식>
		 * 	  int[][] score=new int[3][];//두 번째 열의 개수는 지정하지 않음.
		 * 	  score[0]=new int[3];//첫 행의 열의 개수는 3.
		 * 	  score[1]=new int[2];//두 번째 행의 열의 개수는 2.
		 *    score[2]=new int[1];//세 번째 행의 열의 개수는 1.
		 *    보통 배열은 직사각형 구조인데 유동적으로 바뀜.
		 *    
		 *    3. 직접 배열원소값을 초기화 하면서 가변배열을 생성
		 *    	int[][] arr={
		 *    		{100,100,100},
		 *    		{90,90},
		 *    		{80}
		 *    };   
		 */
		
		int[][] arr={
				   		{100,100,100},
				   		{90,90},
				   		{80}
				     };
		
		for(int i=0;i<arr.length;i++) {//arr.length는 이차원 배열의 행의 개수 즉 3를 반환.
			for(int j=0;j<arr[i].length;j++){//arr[i].lenth는 각 행의 열의 개수를 반환
				System.out.printf("score[%d][%d]=%d %n",i,j,arr[i][j]);
			}
		}
		
		for(int []arr2:arr) {//먼저 2차원 배열을 1차원 배열 arr변경.
			for(int k :arr2) {//1차원 배열을 일반변수로 변경
				System.out.print(k);
			}
	}
	}
}
