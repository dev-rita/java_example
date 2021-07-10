
public class Array15 {

	public static void main(String[] args) {
		//100, 88,100,100,90점을 저장하는 int[] score배열을 생성해서 int타입 총점과 double타입 평균을 구한다.
		
		int [] score= {100,88,100,100,90}; 
		int sum=0;
		
		for(int k:score) {
			sum+=k;
		}
		
		System.out.println("총점="+sum);
		double avg=sum/(double)score.length;//자동산술법에 의해서 double/double이 된다.
		System.out.println("평균="+avg);
	}

}
