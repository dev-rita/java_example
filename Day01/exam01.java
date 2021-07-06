
public class exam01 {

	public static void main(String[] args) {
		char a='a';
		//char b="a"; > ''사용해야함.
		String c="a";
		//String d='a';>""사용해야함.
		//char e="ab";>''사용 및 문자열 사용안됨.
		String f="ab";
		
		System.out.println("a="+a+"\nc="+c+"\nf="+f);
		
		// byte var1=128;>>허용값 -128~127
		short var2=128;
		// int var3=28L; >> L은 Long타입일 때 사용.
		long var4=128L;
		//float var5=123456.789123; >> float타입은 숫자 뒤에 f를 붙여줘야함.
		double var6=123456.789123; // 숫자 뒤에 접미사 d가 생략.
		
		System.out.println("var2="+var2+"\nvar4="+var4+"\nvar6="+var6);
		
		byte bb=127;
		byte cc=126;
		int dd=bb+cc; //bb+cc는 int 타입으로 덧셈 연산을 한다. 덧셈결과도 int 4바이트.
		//더 큰타입을 1바이트 크기 d변수를 저장하려면 강제 형변환 즉 명시적인 코드로 캐스팅 연산자를 사용해 형변환을 해야한다.
		//byte dd=bb+cc; 를 에러가 안나게 하려면 byte를 int형으로 바꿔야한다. 
		//또는 short dd=(short)(bb+cc) / byte dd=(byte)(bb+cc)는 오버플로우
		
		System.out.println(bb+cc+"\n"+dd);
		
		float ab='1';//1을 10진수로 인식해서 에러안남.(char-2byte) 자동 산술변환. 
		System.out.println(ab);
	}

}
