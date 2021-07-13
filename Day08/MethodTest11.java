class Data11{
	int x;
}
public class MethodTest11 {

	public static void main(String[] args) {
		Data11 d=new Data11();
		d.x=10;//x는 값
		System.out.println("d.x="+d.x);
		
		change(d.x);//주소가 전달되는 것이 아니라 값이 전달된다.
		System.out.println("After change(d.x)이후 :"+d.x);//값이 변경 안됨. 주소를 공유하지 않기때문에 대입이 안됨.
	}
	static void change(int x) {//기본타입 매개변수 값만 전달되고 주소값이 공유되지 않았기 때문에 
		x=1000;
		System.out.println("change()메소드 호출 후 : x="+x);//1000
	}
}
