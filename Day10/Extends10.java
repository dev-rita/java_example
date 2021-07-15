class Tv10{
	boolean power;//false 기본값이 초기화, 전원 on/off상태.
	int channel;//채널번호
	
	void power() {
		power=!power;//!power -> true, false가 계속 바뀜.
	}
	
	void channelUp() {
		++channel;//채널증가
	}
	
	void channelDown() {
		--channel;//채널감소
	}
}

class CaptionTv extends Tv10{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {//==true가 생략
			System.out.println(text);
		}
	}
}
public class Extends10 {

	public static void main(String[] args) {
		CaptionTv ctv=new CaptionTv();
		ctv.channel=10;
		ctv.channelUp();
		System.out.println("채널 번호="+ctv.channel);
		ctv.caption=true;
		ctv.displayCaption("Hello, java!");
	}

}
