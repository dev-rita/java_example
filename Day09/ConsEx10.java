class Car10{
	String color;
	String gearType;
	int door;
	
	Car10(){
		this("white","auto",4);
	}
	
	Car10(String color){
		this(color,"auto",4);//같은 클래스의 다른 생성자를 호출함.
	}
	
	Car10(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	void print() {
		System.out.println("차색상:"+color+", 변속기 종류:"+gearType+", 문 개수:"+door);
	}
}
public class ConsEx10 {

	public static void main(String[] args) {
		Car10 c01=new Car10();
		c01.print();
		
		//매개변수 1개로 오버로딩 된 생성자를 호출해서 차색상 blue, 변속기 종류:auto, 문 개수 4개를 출력해보자.
		Car10 c02=new Car10("blue");
		c02.print();
		new Car10("blue").print();

	}

}
