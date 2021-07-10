
public class Array11 {

	public static void main(String[] args) {
		double [] data= {9.5,7.0,13.6,7.5,10.0};
		double max;//최대값을 저장할 변수
		
		max=data[0];//첫 번째 배열원소값 저장
		for(int i=1;i<data.length;i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		System.out.println("배열원소값 중 최대값="+max);
	}

}
