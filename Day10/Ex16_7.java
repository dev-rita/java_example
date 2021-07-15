class Base{
	Base(){
		//super(); 최고조상 Object클래스 기본생성자를 호출하면서 끝이남.
		System.out.print("Base ");
	}
}

class Alpha extends Base{
	//기본생성자 생략 조상클래스 호출.
}
public class Ex16_7 {

	public static void main(String[] args) {
		new Alpha();
		new Base();
	}

}
