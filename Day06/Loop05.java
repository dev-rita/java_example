
public class Loop05 {
	/* for반복문 무한루프 형식)
	 * for(;;){
	 *  실행문장;
	 * }
	 */
	public static void main(String[] args) {
		int n=1;
		for(;;) {
			System.out.print(n+"번 째 for");
			if(++n>=10) {//n++이면 10번 째 for까지 감.
				break;
			}

		}
		System.out.println("The end");
	}


}
