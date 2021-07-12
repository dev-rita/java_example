class Tv11{
	String color;//색상, 기본값 null초기화
	boolean power;//전원상태 on/off 기본값 false로 초기화
	int channel;//채널번호, 기본값 0으로 초기화
	//3개의 클래스 소속 멤버변수 선언 >>인스턴스 변수에 해당(인스턴수 변수는 객체를 생성해서 접근하는 변수)
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class ObjectEx11 {

	public static void main(String[] args) {
		Tv11 t=new Tv11();//객체주소가 저장된 참조변수 t, t는 곧 객체명이 된다.
		t.channel=7;
		t.channelDown();//채널 감소
		
		System.out.println("현재 채널:"+t.channel+"번호");
	}

}
