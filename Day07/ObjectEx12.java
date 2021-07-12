class Tv12{
	String color;
	boolean power;
	int channel;
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class ObjectEx12 {

	public static void main(String[] args) {
		
		Tv12 t01=new Tv12();
		Tv12 t02=new Tv12();
		
		System.out.println("tv01 채널번호 : "+t01.channel);
		System.out.println("tv02 채널번호 :"+t02.channel);
		
		t01.channel=10;//t01과 t02는 각각 서로 다른 객체주소를 가진다.
		
		System.out.println("t01 채널번호:"+t01.channel);//10
		System.out.println("t02 채널번호:"+t02.channel);//0
	}

}
