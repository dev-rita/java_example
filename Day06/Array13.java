
public class Array13 {

	public static void main(String[] args) {
		int[] score=new int[5];
		
		//배열원소 초기화
		for(int i=0;i<score.length;i++) {
			score[i]=i*10+50;
		}
		
		//일반 for반복문으로 출력
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] :"+score[i]);
		}
		System.out.println("\n================>");
		
		//배열원소 초기화2
		int [] arr=new int[] {10,20,30};//new int[]는 생략 가능.
		
		//향상된 확장 for반복문으로 출력.
		for(int k:arr) {
			System.out.print(k+"\t");
		}
		
		//배열원소 초기화3 (잘안씀)
		int[] numArr;//배열선언만 함.
		numArr= new int[]{100,200,300};
		
		//누적합
		int sum=0;
		for(int a:numArr) {
			sum+=a;
		}
		System.out.println("\n 배열 원소 누적합="+sum);
	}

}
