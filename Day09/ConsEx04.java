class MyDate04{
	private int year;
	private int month;
	private int day;
	
	public MyDate04(int new_year, int new_month, int new_day) {
		year=new_year;
		month=new_month;
		day=new_day;//멤버변수 초기화
	}//매개변수 개수가 다른 생성자 오버로딩을 하면 자바 컴파일러는 기본 생성자를 묵시적으로 제공하지 않는다.

	public void pr() {
		System.out.println(year+"/"+month+"/"+day);
	}
}
public class ConsEx04 {

	public static void main(String[] args) {
		//MyDate04 m=new MyDate04();// MyDate04()는 컴파일 에러. 기본생성자를 묵시적으로 제공하지 않기 때문.
		MyDate04 md=new MyDate04(2021,5,6);
		md.pr();
	}
	

}
