class MyDate06{
	int year=2021;
	int month=5;
	int day=3;
}
public class MethodTest06 {

	public static void main(String[] args) {
		int x=7;
		int y=x;
		
		MyDate06 d=new MyDate06();
		MyDate06 t=d;//t와 d는 같은 객체 주소를 가진다. 그러므로 값도 공유한다.
		if(t==d) System.out.println("주소가 서로 같다.");
		else System.out.println("주소가 서로 다르다.");
		
		System.out.println("x="+x+", y="+y);
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		y=10;
		System.out.println("x="+x+", y="+y);//x변수 값 변경 없음.
		t.year=2022;
		t.month=6;
		t.day=5;
		System.out.println(t.year+"/"+t.month+"/"+t.day);
		System.out.println(d.year+"/"+d.month+"/"+d.day);//값 공유
		
		t=new MyDate06();//새로운 주소를 가짐.
		t.year=2023;
		t.month=7;
		t.day=8;
		System.out.println(t.year+"/"+t.month+"/"+t.day);
		System.out.println(d.year+"/"+d.month+"/"+d.day);//값 공유x
		
	}

}
