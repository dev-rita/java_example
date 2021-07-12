
public class TwoArray03 {

	public static void main(String[] args) {
		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};//5행*3열의 2차원 배열 원소값 저장
		
		//각 과목별 총점.
		int korTotal=0;
		int engTotal=0;
		int mathTotal=0;
		
		System.out.println("번호  국어 영어 수학  총점   평균");
		System.out.println("===========================");
		
		for(int i=0;i<score.length;i++) {
			int sum=0; //개인별 총점
			double avg=0.0; // 개인별 평균
			
			korTotal+=score[i][0];//첫 번째 열의 합. 국어총점
			engTotal+=score[i][1];//두 번째 열의 합. 영어총점
			mathTotal+=score[i][2];//세 번째 열의 합. 수학총점
			System.out.printf("%3d",i+1);//번호 출력. %3d는 3자리 십진수 정수 표현
			
			for(int j=0;j<score[i].length;j++){// score[i].length는 각 행의 열의 개수(=3)
				sum+=score[i][j];//각 과목 별 총점
				System.out.printf(" %3d",score[i][j]);//각 과목별 점수 출력.
			}//inner for
			avg=sum/(double)score[i].length;//int/double로 자동 산술법에 의해서 double/double이 된다.
			System.out.printf("%5d %5.1f %n",sum, avg); //각 행마다 총점과 평균 출력 및 줄바꿈
			//%5.1f출력형태지시자는 십진수 실수 숫자형태이고,
			//소수점을 포함한 총 자리수는 5자리면서 소수점 이하 첫째자리 까지 표현
		
		}//outer for
		System.out.println("============================");
		System.out.printf("총점:%3d %4d %4d %n",korTotal, engTotal, mathTotal);
	}

}
