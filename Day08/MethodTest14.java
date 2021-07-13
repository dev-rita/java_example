//문제> static void printArr(int[] arr){}메소드를 정의해서 향상된 확장 for반복문으로 배열 원소값을 2번 출력
//문제2> static int sumArr(int[] arr){}메소드를 정의해서 배열원소 누적합을 구해서 반환받아 출력한다.
public class MethodTest14 {

	public static void main(String[] args) {
		int[] arr= {3,2,1,6,5,4};
		printArr(arr,2);//배열 원소값 2번 출력
		System.out.println(sumArr(arr));//배열원소 누적합 출력
	}
	
	static void printArr(int[] arr,int num){//확장 for반복문으로 배열 원소값 출력
		for(int i=0;i<num;i++) {//num만큼 반복
			for(int k:arr) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	static int sumArr(int[] arr){//for 반복문으로 배열원소 누적합 출력
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;//return으로 누적합을 반환
	}
}
