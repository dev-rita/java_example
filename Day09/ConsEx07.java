class MyDate07{
	private int year;
	private int month;
	private int day;
	
	MyDate07(){
		this(2021,5,6);//같은 클래스 내 다른 생성자 호출.
		this.pr();
	};
	
	MyDate07(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	void pr() {
		System.out.println(year+"/"+month+"/"+day);
	}
}
public class ConsEx07 {

	public static void main(String[] args) {
		MyDate07 md=new MyDate07();
		md.pr();
		MyDate07 md2=new MyDate07(2022,5,9);
		md2.pr();
	}

}
