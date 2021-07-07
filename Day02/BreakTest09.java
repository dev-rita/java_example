/*break 문)
 * 반복문내에서 이 문장을 만나면 해당 반복문을 강제 중단한다.
 */
public class BreakTest09 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n======================\n");
		
		for (int k=1;k<=10;k++) {
			System.out.print(k+" ");
			if(k==3) {
				break;//반복문 중단
			}//if
		}//for
		System.out.print("\n======================\n");
		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			if(i==3) {
				break;
			}
			i++;
		}
		
		System.out.print("\n======================\n");
		i=1;
		do {
			System.out.print(i+" ");
			if(i==3) {
				break;
			}
			i++;
		}while(i<=10);
	}

}
