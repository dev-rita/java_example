
public class for09 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					System.out.println(""+i+j+k);//""한 이유는 덧셈을 하지 않고 숫자를 문자로 변경해서 연결하기 위해서다.
				}//첫 번째 for
			}//두 번째 for
		}//세 번째 for
	}

}
