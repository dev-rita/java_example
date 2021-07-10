
public class Array17 {

	public static void main(String[] args) {
		int [] numArr=new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=i;//0~9 배열원소값 저장
			System.out.print(numArr[i]+" ");
		}
		
		System.out.println("\n");
		
		//배열원소값을 섞는다.
		for(int i=0;i<100;i++) {
			int n=(int)(Math.random()*10);//random()메소드*10는 0.0이상 10.0미만 사이의 실수숫자 난수 생성.>>int로 캐스팅.
			int g=(int)(Math.random()*10);
			numArr[n]=g;
			/*int tmp=numArr[0];//tmp에 numArr[0]값 대입
			numArr[0]=numArr[n];//num[0]에 numArr[n]주소값 대입.
			numArr[n]=tmp;//numArr[n]에 tmp값 대입.*/
		
		}
		//섞고 난 후 출력
		for (int k:numArr) {
			System.out.print(k+" ");
		}
		
	}

}
