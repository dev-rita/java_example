/* While 반복문 형식)
 * while(조건식){
 * 	조건식이 참이면 실행;
 * 	증감식;
 * }
 */
public class WhileTest03 {

	public static void main(String[] args) {
		int i=1;//반복문 제어변수
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println("\ni="+i);//줄바꿈
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i+=2;
		}

		System.out.println("\ni="+i);//줄바꿈
		
		//문제 5 4 3 2 1 출력
		i=5;
		while(i>=1) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
		int total=0;//누적합
		i=1;
		while(i<=10) {
			total+=i;
			i++;
		}
		System.out.println("누적합="+total);
	}

}
