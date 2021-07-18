
public class String05 {

	public static void main(String[] args) {
		String s="Hello";
		char c=s.charAt(1);//첫 문자를 0부터 시작해서 두 번째 단일문자를 구함.
		System.out.println(c);
		
		String s2="abcdefg";
		boolean re=s2.contains("bc");//bc문자가 포함되어 있으면 참
		System.out.println(re);
		
		String s3="Hello";
		int idx01=s3.indexOf('o');//첫 문자를 0부터 시작해서 'o'에 해당하는 인덱스 번호값을 반환한다.
		System.out.println("'o'문자 위치 번호값 >>"+(idx01+1));//첫 문자를 1부터 세기위해 +1을 함.
		
		String s5="java.lang.Object";
		//'.'를 맨 왼쪽에서 찾아서 가장 먼저 나오는 해당 문자 실제 위치 번호를 구해본다.
		System.out.println("'.'문자를 왼쪽부터 찾았을 때 최초 위치번호는>>"+(s5.indexOf('.')+1));
		//'.'를 맨 오른쪽에서 찾아서 가장 먼저 나오는 해당 문자 실제 위치 번호를 구해본다.
		System.out.println("'.'문자를 오른쪽부터 찾았을 때 최초 위치번호는>>"+(s5.lastIndexOf('.')+1));
		
	}

}
