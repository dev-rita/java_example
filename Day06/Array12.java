
public class Array12 {

	public static void main(String[] args) {
		int [] score=new int[5];
		int k=1;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		
		int tmp=score[k+2]+score[4];//score[3]+score[4]=80+90=170
		
		//향상된 반복문으로 배열원소값 출력
		
		for(int a:score) {
			System.out.print(a+" ");
		}
		System.out.println("\n=================>");
		System.out.printf("tmp=%d %n", tmp);
		//System.out.printf("score[%d]:%d %n",5, score[5]); 
		//없는 배열주소 인덱스 번호에 접근하다 보니 예외 오류가 발생 =>ArrayIndexOutOfBoundsException
	}
}
