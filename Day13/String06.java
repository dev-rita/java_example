
public class String06 {

	public static void main(String[] args) {
		String s="Hlellol";
		System.out.println("Hlellol 문자열 길이:"+s.length());

		String s2=s.replace('l','r');//Hello에서 H를 찾아서 C로 변경
		System.out.println(s2);

		String animals="dog,cat,bear";
		String[] arr=animals.split(",");
		//,를 기준으로 문자열을 분리. 분리된 문자를 토큰 문자라고 한다. 토큰 문자를 배열로 처리.

		System.out.println("토큰 문자 개수: "+arr.length);

		//향상된 확장 for문으로 토큰문자 출력
		for(String k:arr) {
			System.out.println(k);
		}
		
		//split()메소드는 공백도 문자로 인정한다. StringTokenizer는 공백을 문자로 인정 안함.
		String s3="java.lang.Object";
		String p=s3.substring(5,9);//5이상 9미만의 사이의 문자를 추출(첫 문자를 0부터 시작)
		System.out.println("추출된 문자:"+p);

		s3=" Hello Java ";
		String s4=s3.trim();//양쪽 공백을 제거
		System.out.println("\""+s3+"\""+">>"+"\""+s4+"\"");
	}

}
