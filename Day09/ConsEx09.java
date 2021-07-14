class Car{
	String color;//차 색상
	String gearType;//변속기 종류>>자동, 수동
	int door;//문의 개수
	
	Car(){}
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}//생성자 오버로딩
	
	void pr() {
		System.out.println("차색상:"+color+" 변속기 종류:"+gearType+" 문의 개수:"+door);
	}
}
public class ConsEx09 {

	public static void main(String[] args) {
		Car car=new Car("RED","AUTO",4);
		
		System.out.println("차색상:"+car.color+" 변속기 종류:"+car.gearType+" 문의 개수:"+car.door);
		
		//외부 객체 car로 클래스 소속 멤버변수에 직접 접근하는 것은 좋은 방법이 아니다.
		//객체지향언어 방법으로 변경해서 출력해보자.
		car.pr();
		
	}

}
