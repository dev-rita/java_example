
public class Loop04 {

	public static void main(String[] args) {
/*무한 루프란>
 * 1.반복문의 조건식이 무조건 true(참)여서 영원히 반복하는 반복문
 * 2.while 무한루프문 형식>
 *  while(true){
 *  	실행문장;
 *  }
 */
		int i=1;
		while(true) {
			System.out.print(i+"번 째abc"+" ");
			if(++i>=10) {
				break;
			}
		}
		System.out.println("The end");
	}

}
