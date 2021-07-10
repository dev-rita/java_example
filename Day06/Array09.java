
public class Array09 {

	public static void main(String[] args) {
		/* 배열의 특징>>
		 * 1. 동일한 자료형의 하나이상의 복수개의 원소값을 고정된 크기로 한꺼번에 저장하기 위해서 사용한다.
		 * 2. 배열생성법>>
		 *    -new연산 키워드를 사용
		 *      ->자료형타입 [] 배열명 = new 자료형 [배열크기]
		 */
		
		int [] score=new int [5]; // 배열크기가 5인 score배열 생성. 배열크기 = 배열원소 개수.
		
		score[0]=100;//첫 번째 배열주소 인덱스 번호는 0부터 시작한다.
		score[1]=95;
		score[2]=70;
		score[3]=100;
		score[4]=80;
		
		System.out.println("배열크기"+score.length);
		
		//일반 for반복문으로 배열원소값 출력
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println("\n====================");
		
		//jdk 1.5에 추가된 향상된 확장 for반복문으로 배열원소값을 가져옴.
		
		for(int k:score) {
			System.out.print(k+" ");
		}
		
		/* 향상된 확장 for반복문 특징>
		 * 1. 배열 또는 컬렉션에 저장된 복수개의 원소값을 쉽게 읽어오는 용도로 활용함.\
		 * 2. 형식 > 
		 * for(자료형 변수명:배열명){
		 * 		실행문장;
		 * }
		 */
	}

}
