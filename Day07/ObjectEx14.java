class Tv14{
	int channel;
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class ObjectEx14 {

	public static void main(String[] args) {
		Tv14[] tvArr=new Tv14[3]; // 배열크기가 3인 Tv14객체 배열 생성.
		
		for(int i=0;i<tvArr.length;i++) {//i 0,1,2
			tvArr[i]=new Tv14();//객체 주소를 저장하면서 초기화.
			tvArr[i].channel=i+10;//10 11 12 저장
		}
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i].channelUp();//채널번호 업
			System.out.println("tvArr["+i+"]의 채널 번호:"+tvArr[i].channel);
			//11 12 13
		}
	}
}
