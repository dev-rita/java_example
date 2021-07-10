
public class Continue03 {

	public static void main(String[] args) {
/* Continue문의 특징)
 * 반복문 내에서 continue문을 만나면 아래 문장을 실행하지 않고 반복문 처음으로 돌아가서 다음 반복을 계속한다. 
 */
		for(int i=1;i<=10;i++) {
			if(i%3==0) {// 3의 배수일 때 실행
				continue;//아래문장 실행 안함.
			}
			System.out.print(i+" ");
		}
	}

}
