
public class DoWhile06 {

	public static void main(String[] args) {
		/*Do~While 반복문 형식)
		 * do{
		 * 조건식이 참일동안만 반복실행;
		 * 증감식;
		 * }while(조건식);
		 * 
		 * 나중에 조건을 검사하기 때문에 조건식이 거짓이라도 무조건 한번은 실행한다.
		 */
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}while(i<0);
		
	}

}
