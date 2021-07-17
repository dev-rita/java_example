class Point14{//extend Object가 생략되어 있다.
	int x,y;
	
	public Point14() {};
	public Point14(int x, int y) {
		this.x=x;
		this.y=y;
	}//생성자 오버로딩
	
	@Override
	public boolean equals(Object obj) {
		Point14 ptTmp=(Point14)obj;//명시적인 다운캐스팅, 업캐스팅을 한 것에 한해서만 다운캐스팅을 허용한다.
		if((x==ptTmp.x)&&(y==ptTmp.y)) {//인스턴스 값만 비교함.
			return true;
		}else {
		return false;}
	}
}
public class ObjectEquals14 {
	public static void main(String[] args) {
		Point14 p01=new Point14(10,20);
		Point14 p02=new Point14(10,20);//p01과 p02 각 객체주소는 다르다.
		
		if(p01==p02) {//주소값을 비교
			System.out.println("두 객체주소가 같다");
		}else {
			System.out.println("두 객체주소가 다르다");
		}
		System.out.println("============================");
		if(p01.equals(p02)) {//Object obj=p02//업캐스팅
			System.out.println("두 객체의 내용물이 같다.");
		}else {
			System.out.println("두 객체의 내용물이 다르다.");
		}
	}//기본타입 값 비교는 ==, 참조타입은 오버라이딩된 메소드로 비교.
}
