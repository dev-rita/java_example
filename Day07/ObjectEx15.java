
public class ObjectEx15 {

	public static void main(String[] args) {
		
		int [] numArr=new int[10];
		
		for(int i=0;i<10;i++) {
			numArr[i]=(int)(Math.random()*10);//random()은 0.0이상 1.0미만 사이의 실수 숫자 난수 발생.
			                                  //0.0이상 10.0미만 > int로 캐스팅 0~9
		}
		
		//향상된 for반복문으로 배열원소값을 출력.
		for(int k:numArr) {
			System.out.print(k+" ");
		}
		
		System.out.println();
		
		//일반 for 배열원소 값을 출력
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		//OOP즉 객체지향언어를 사용하지 않아서 비슷한 기능이 계속해서 반복됨>>비효율적.
		printArr(numArr);
	}
	
	static void printArr(int[] arr) {
		for (int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println("\n=====================");
	}//중복코드 제거하는 장점
}
