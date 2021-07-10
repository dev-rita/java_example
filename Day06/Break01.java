
public class Break01 {

	public static void main(String[] args) {
		/*	break문 특징)
		 *  반복문에서 break문을 만나면 반복문을 중단한다.
		 */
		
		int i;//반복문 제어변수
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n===========================");
		
		for(i=1;i<=10;i++) {
			if(i%3==0) {//3의 배수일 때
				break;//반복문 중단
			}
			System.out.print(i+" ");//1,2만 출력됨.
		}
	}

}
