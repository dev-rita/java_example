class MyDate01{
	private int year;//int타입 멤버변수 기본값은 0
	private int month;
	private int day;
	
	public MyDate01() {
		//매개변수가 없는 기본 생성자
		System.out.println("기본 생성자 호출");
	}//생성자(Constructor), 클래스이름과 같고 리턴값이 없다.(그러므로 리턴타입을 적지 않는다.)
	//인스턴스 변수들을 초기화 시킨다. 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있어야 한다.
	//정의하지 않고도 인스턴스를 생성할 수 있었던 이유는 컴파일러가 제공하는 기본생성자 덕분.
	
	public void pr() {
		System.out.println(year+"/"+month+"/"+day);
	}//메소드
}
public class ConsEx01 {

	public static void main(String[] args) {
		MyDate01 md=new MyDate01();//new 클래스명();에 의해서 생성자 호출
		md.pr();
	}

}
