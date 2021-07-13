class MyDate05{
	int year=2021;
	int month=5;
	int day=3;//클래스 소속의 3개의 멤버변수 선언
}
public class MethodTest05 {
	public static void main(String[] args) {
		
		MyDate05 d;//d 참조변수만 선언. 객체주소가 저장안된 레퍼런스 즉 참조형 변수.
		
		//System.out.println(d.year+"년"+d.month+"일"+d.day+"일"); 
		
		d=new MyDate05();//객체주소가 저장된 참조변수 즉 객체명 d
		System.out.println(d.year+"년"+d.month+"일"+d.day+"일");
	}

}
