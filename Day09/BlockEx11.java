
public class BlockEx11 {
	/* 클래스 소속 멤버변수 종류>>
	 * 1. 정적변수(클래스 변수): static 예약어로 정의된 변수를 말한다. 
	 *    정적변수는 해당클래스로 직접 접근할 수 있다. 생성된 객체에 의해서 값을 공유한다.
	 * 2. 인스턴스 변수: static 예약어로 정의 안된변수를 주로 말한다. 생성된 객체에 의해서 따로 주소를 관리한다.
	 *    즉 생성된 객체마다 주소값이 다르다.
	 */
	static {//정적변수 즉 클래스 변수 초기화 블록. 해당 클래스가 메모리에 처음 실행될 때 딱 한번만 수행.
		System.out.println("static 초기화 블록");
	}
	{//인스턴스 초기화 블록. 객체 생성될 때 마다 수행되고, 생성자보다 먼저 실행된다.
		System.out.println("인스턴스 변수 초기화 블록");
	}
	
	public BlockEx11() {
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		new BlockEx11();//static 초기화 블록은 한번만 실행됨.
		new BlockEx11();//생성자를 호출하지만 먼저 인스턴스 변수 초기화 블록이 수행.
	}

}
