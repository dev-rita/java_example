class TestSuper{
	
	TestSuper(){} //기본생성자를 따로 생성해줘야 에러가 안생김.
	TestSuper(int i){} //생성자 오버로딩을 함. 생성자가 오버로딩되면 기본생성자를 묵시적으로 제공하지 않는다.
}
class TestSub extends TestSuper{
	//기본생성자가 생략됨. 조상클래스의 기본생성자를 호출하려다가 에러가 발생.
}
public class Ex16_6 {

	public static void main(String[] args) {
		new TestSub();
		//new TestSuper(); >>생성자 에러
	}

}
