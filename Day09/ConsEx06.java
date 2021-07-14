class MyDate06{
	private int year;
	private int month;
	private int day;
	
	public MyDate06(){}//기본생성자 > 디폴트 생성자로 매개변수가 없는 생성자를 말한다.
	
	public MyDate06(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;//클래스 소속 멤버면수와 생성자 매개변수명이 같을 때는 멤버면수명 앞에 this.를 붙임으로써 클래스 소속이라는 것을
		//알려주면서 구분되어져 값이 저장됨.
		//this 키워드는 내 자신 클래스에 선언된 인스턴스 변수를 가리키는 참조변수.
	}//매개변수 개수가 다른 생성자 오버로딩
	
	void setYear(int year){
		this.year=year;
	}
	
	void setMonth(int month){
		this.month=month;
	}
	
	void setDay(int day){
		this.day=day;
	}
	
	void print() {
		System.out.println(year+"/"+month+"/"+day);
	}
}
public class ConsEx06 {

	public static void main(String[] args) {
		MyDate06 md=new MyDate06(2021,5,6);
		md.print();
		
		md.setYear(2022);md.setMonth(3);md.setDay(5);
		md.print();
	}
}
