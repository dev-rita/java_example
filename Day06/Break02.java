
public class Break02 {

	public static void main(String[] args) {
		int i;
		int a;//반복문 제어변수
		
		for(a=1;a<=5;a++) {
			for(i=1;i<=5;i++) {
				if(i%3==0) {
					break;//맨 안쪽 for반복문만 중단한다.
				}
				System.out.print("i->"+i+" ");
			}
			System.out.println("\n a->"+a);
		}
		System.out.println("\n======================");
		
		exit_for://임의의 레이블명, 레이블로 지정한 반복문을 빠져나간다.
			for(a=1;a<=5;a++) {
				for(i=1;i<=5;i++) {
					if(i%3==0) {
						break exit_for;//이중 for반복문을 중단한다.
					}
					System.out.print("i->"+i+" ");
				}
				System.out.println("\n a->"+a);
			}
	}
//	break exit_for;//이중 for반복문을 중단한다.
// continue exit_for;//이중 for반복문 끝으로 이동한다.(아래 문장들 무시)
}
