import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
	String[] txt = new String[4];

	txt[0]="홍길동,20,서울시,남자";

	txt[1]="아무개,25,부산시,남자";

	txt[2]="호호호,23,,여자";//StringTokenizer는 공백 포함x, 토큰은 공백이 없는 연속된 문자의 집합

	txt[3]="하하하,,인천시,남자";

	for(String line : txt) {

		//분리

		String[] temp = line.split(",");

				

		for(String item : temp) {

			System.out.print(item+"\t");

		}

	  System.out.println();

	}	



	System.out.println("===========================");
	
	for(String line : txt) {

		StringTokenizer st = new StringTokenizer(line, ",");

		while(st.hasMoreTokens()) {

			System.out.print(st.nextToken()+"\t");

		}

		System.out.println();

	
}
	}
	}