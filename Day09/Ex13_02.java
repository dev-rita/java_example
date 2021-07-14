class Product2{//클래스 이름 중복으로 인해 변경
	String name;
	int price;
	
	Product2(){}
	Product2(String name){
		this(name,800);
	}
	Product2(int price){
		this("물",price);
	}
	Product2(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	void print(){
		System.out.println(name+", "+price);
	}
}
public class Ex13_02 {

	public static void main(String[] args) {
		Product2 p1=new Product2("웰치스",700);
		Product2 p2=new Product2("커피");
		Product2 p3=new Product2(500);
		Product2 p4=new Product2();
		
		p1.print();
		p2.print();
		p3.print();
		p4.print();
	}

}
