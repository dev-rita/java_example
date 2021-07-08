
public class DataTest04 {

	public static void main(String[] args) {
		int year=2021;
		int age=28;
		
		System.out.println("년도값 : "+year+"\n 나이 : "+age);
		
		int x=100, y=200, tmp=0;
		
		System.out.println("x="+x+"y="+y+"tmp="+tmp);
		
		tmp=x;
		x=y;
		y=tmp;
		System.out.println("x="+x+"y="+y+"tmp="+tmp);
		
		/* jdk 1.7부터는 정수형 값 중간에 구분자 _를 넣어서 큰 숫자를 편하게 읽을 수 있게한다.
		 * 숫자형(정수,실수)에 _(underscore) 문자열을 사용 할 수 있다. 큰 숫자들을 다룰 경우 가독성이 향상
			int billion = 1_000_000_000; // 10^9
			long creditCardNumber = 1234_4567_8901_2345L; //16 digit number
			long ssn = 777_99_8888L;
			double pi = 3.1415_9265;
			float pif = 3.14_15_92_65f;
			
			double pi = 3._1415_9265; // 소수점 뒤에 _ 붙일 경우
			long creditcardNum = 1234_4567_8901_2345_L; // 숫자 끝에 _ 붙일 경우
			long ssn = _777_99_8888L; // 숫자 시작에 _ 붙일 경우

		 */
		int billion = 1_000_000_000;
		System.out.println(billion);
	}

}
