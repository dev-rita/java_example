
public class DataTest03 {

	public static void main(String[] args) {
		
		double a=23.7;// 접미사 d 및 D가 생략됨. double타입은 15자리 정밀도.
		float b=233.72f;// float타입은 7자리 정밀도.
		System.out.println(a);
		System.out.println(b);
		char x;
		x='A';//십진수 정수 65
		System.out.printf("%c -> %d %n",x,(int)x);//%c는 단일문자 출력형태, %d는 십진수 정수 출력형태.%n은 줄바꿈.
		
		x='0';//십진수 정수 48
		System.out.printf("%c -> %d %n",x,(int)x);
		
		x='a';//십진수 정수 97
		System.out.printf("%c -> %d \n",x,(int)x);
		
		String name="홍길동";//String은 문자열 클래스형에 해당하는 참조타입 즉 레퍼런스 형이다.
		System.out.printf("%s \n",name);
	}

}
