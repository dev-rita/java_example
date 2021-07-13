class Data12{
	int x;
}
public class MethodTest12 {

	public static void main(String[] args) {
		Data12 d=new Data12();
		d.x=10;
		System.out.println("x="+d.x);
		
		change(d);//객체 주소를 전달
		System.out.println("After change(d) \n x="+d.x);//값이 공유되므로 x=100이 됨.
	}
	static void change(Data12 d) {//int x라고 하면 안된다. 같은 타입으로 입력.
		                          //값이 전달되는 것이 아니라 주소값이 전달되어서 함께 값을 공유함.
		d.x=100;
		System.out.println("change() 메소드 호출 후 : x="+d.x);
	}
}
