class MyDate10{
	int year=2021;
	int month=5;
	int day=3;
}

public class MethodTest10 {

	public static void main(String[] args) {
		MyDate10 d=null;
		//레퍼런스 참조변수 d에 null 대입하면 컴파일 에러는 발생하지 않고 실행시 예외 오류가 나온다.
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		
	}

}
