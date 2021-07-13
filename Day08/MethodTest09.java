class MyDate09{
	int year=2021;
	int month=4;
	int day=30;
	
	void p() {
		System.out.println("d");
	}
}

class RefMethod{
	void changeDate(MyDate09 t){//매개변수 타입이 참조타입이다. rm.changeDate(d);>>t=d같은 주소를 가리킨다.
		t.year=2022;
		t.month=5;
		t.day=1;
		t.p();
	}
}
public class MethodTest09 {

	public static void main(String[] args) {
		RefMethod rm=new RefMethod();
		MyDate09 d=new MyDate09();
		
		System.out.println("메소드 호출전 d->"+d.year+"년"+d.month+"월"+d.day+"일");
		
		rm.changeDate(d);//인자값으로 값이 전달되는 것이 아니라 참조타입은 객체주소가 전달됨.
		System.out.println("메소드 호출전 d->"+d.year+"년"+d.month+"월"+d.day+"일");//주소값을 공유해서 값이 변경됨.
		
	}
}
