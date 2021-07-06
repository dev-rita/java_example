
public class Data04 {

	public static void main(String[] args) {
		byte a=1;
		short b=128;
		int c=32768;
		
		b=a; //암시적인 형변환. 대입연산자로 오른쪽 값을 왼쪽변수에 대입.
		     //1바이트가 2바이트 변수에 저장할 때는 자바 컴파일러에 의해서 자동형변환을 해준다.
		     //이유는 더 큰타입으로 변환되어 자료손실 위험이 없기 때문이다.
		System.out.println(b);
		
		b=(short)c; //명시적인 형변환(캐스팅 연산자. 형변환 연산자.). 
					//b=c는 자바 컴파일러가 자료손실위험도 있고 해서 자동형 변환을 해주지 않는다.(컴파일 에러)
		            //이런 경우에는 자바 개발자에 의해서 강제 형변환 즉 캐스팅 연산자인 형변환을 해야한다.

		System.out.println("short 최대값 범위를 벗어난 오버플로우 현상이 발생된 값은 결국 short범위 최소값="+b);
		            //오버플로우가 발생되어 이상한 값 출력.
		
		double x=100.5; //값 뒤에 접미사 d 또는 D가 생략됨.
		float y=100.5f; //값 뒤에 접미사 f 또는 F가 붙는다.
		
		System.out.println("double타입 실수값"+x);
		System.out.println("float타입 실수값"+y);
		
	}

}
