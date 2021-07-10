
public class Array16 {

	public static void main(String[] args) {
		int [] score = {85,95,94,99,98};
		
		//for 반복문, if,else if다중 조건문을 활용하여 최대값과 최소값을 구해보자.
		int max=score[0], min=score[0];//인덱스 0 원소값 대입.
		for(int i=1;i<score.length;i++) {//인덱스 1~4 값 대입.
			
			if(score[i]>max) {
				max=score[i];
			}
			else if(score[i]<min) {
				min=score[i];
			}			
		}
		System.out.println("최대값="+max+", 최소값="+min);
	}

}
