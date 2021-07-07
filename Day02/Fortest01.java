/*for 반복문 형식)
 * for(초기치;조건식;증감식){
 * 조건식이 참일동안만 반복문 실행
 * }
 */
public class Fortest01 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			System.out.println("Hello java");
		}


		//1부터 100까지의 합을 구해본다.
		int result=0;
		for(int i=1;i<101;i++)
		{
			result+=i;
		}
		System.out.println(result);


		//5 4 3 2 1 > 1씩 감소
		for(int i=5;i>=1;i--) {
			System.out.println(i+"\t");
		}	
	}
}
