
public class Array10 {

	public static void main(String[] args) {
		/* new연산 이외의 배열 생성법
		 * >> 배열원소값을 직접 저장하면서 만든다.
		 */
		
		int [] score= {100,90,90};
		
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		} 
		System.out.println();
		//향상된 확장 for반복문을 사용하여 배열원소 누적합을 int형으로 평균을 double형으로 구해서 출력한다.
		
		int sum=0;
		double avg=0.0;
		
		for(int k:score) {
			sum+=k;
		}
		System.out.println("배열원소 누적합="+sum);
		avg=(double)sum/score.length;//자동 산술법에 의해서 double/double이 된다. 
		System.out.println("배열원소 평균="+avg);
	}

}
