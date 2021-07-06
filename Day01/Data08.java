
public class Data08 {

	public static void main(String[] args) {
		/* 확장 특수문자 종류>
		 *  \t:tab 키만 큼 수평으로 띄움, \": "문자의미
		 *  \':'문자의미
		 *  \\는 \로 표시되고 주로 폴더 경로 구분 (웹개발에서 자료실 구현할 때 첨부파일을 서버에 업로드 하는 경로를 구할 때 사용됨.)
		 */
		
		System.out.println("홍길동\t이순신\t강감찬");//\t는 tab키 만큼 수평으로 띄움.
		System.out.println("\"반갑습니다.자바\"");//\"는 "로 표시.
		System.out.println("반갑습니다.자바\n");//\n은 개행. 즉 줄바꿈.
		System.out.println("\'서울시\'");//\'는 '로 표시.
		System.out.println("D:\\");//\\는 \로 표시.
		
		//println()메소드에서 ln은 줄바꿈.
	}

}
