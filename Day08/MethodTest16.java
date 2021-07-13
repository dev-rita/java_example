
class Data{
	int x;//멤버변수 x선언 기본값 0으로 초기화
}
public class MethodTest16 {

	static Data copy(Data d) {//메소드 리턴타입(Data)과 매개변수타입(Data d)이 기본타입이 아니고 참조타입이다.
		Data tmp=new Data();//tmp와 d는 서로 다른 객체주소
		tmp.x=d.x;//주소값은 다르고 멤버변수 값만 저장
		return tmp;//tmp객체주소가 반환
	}
	
	public static void main(String[] args) {
		Data d=new Data();
		d.x=10;
		
		Data d2=copy(d);//d와 d2는 서로 다른 객체 주소이다.
		System.out.println("d.x="+d.x);
		System.out.println("d2.x="+d2.x);
	}
}


