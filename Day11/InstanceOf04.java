class HandPhone{
	String model;//모델명
	String number;//폰번호

	public HandPhone() {}
	
	public HandPhone(String model, String number) {
		this.model=model;
		this.number=number;
	}
}

class DicaPhone extends HandPhone{
	String pixel;
	
	public DicaPhone() {}
	
	public DicaPhone(String model, String number, String pixel) {
		super(model,number);
		this.pixel=pixel;
	}
	
	public void prn() {
		System.out.println("모델명:"+model+", 폰번호:"+number+", 화소수:"+pixel);
	}
}
public class InstanceOf04 {

	public static void main(String[] args) {
		DicaPhone dp=new DicaPhone("갤럭시","010-999-9999","2056");
		
		dp.prn();
		
		if(dp instanceof DicaPhone) {//참
			System.out.println("dp는 디카폰이다.");
		}
		//HandPhone hp=new HandPhone();여기서 선언하고 41줄에서 HandPhone과 44줄 전체 삭제하면 다운캐스팅이 가능함.(업캐스팅이 됐기 때문)
		if(dp instanceof HandPhone) {
			//dp 참조변수는 업캐스팅이 가능한가? 참, instanceof연산자 키워드는 형변환 유무 판단 연산자로서 결과값이 boolean타입이다.
			System.out.println("업캐스팅이 가능함.");
			HandPhone hp=dp;
		}
		
		HandPhone hp=new HandPhone();
		if(hp instanceof DicaPhone) {//hp참조변수가 다운캐스팅이 가능한가? 거짓 사전에 업캐스팅을 하지 않아서 불가능함.
			System.out.println("다운캐스팅 가능함");
			DicaPhone dp2=(DicaPhone)hp;
		}else {
			System.out.println("다운캐스팅 불가능함");
		}
	}

}
