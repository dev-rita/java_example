class Product{
	int price;//제품 가격
	int bonusPoint;//제품 구매시 적립포인트

	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);//보너스 포인트는 제품가격의 10%
	}//생성자 오버로딩
}

class Tv extends Product{
	Tv(){
		super(100);//조상클래스의 생성자 호출. Tv의 가격은 100.
	}

	@Override
	public String toString() {
		return "TV";
	};//Object클래스의 toString()을 오버라이딩.
}

class Computer extends Product{
	Computer(){
		super(200);//조상클래스의 생성자 호출. Computer의 가격은 200.
	}

	@Override
	public String toString() {
		return "Computer";
	};
}

class Buyer{
	int money=1000;//소유금액
	int bonusPoint=0;//보너스점수

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족해 물건을 구매할 수 없습니다.");
		}
		money-=p.price;//소유금액에서 구입한 제품의 가격을 뺀다.
		bonusPoint+=p.bonusPoint;//제품의 보너스 포인트를 더한다.
		System.out.println(p+"을 구매하셨습니다.");//toString() 자동호출.
	}
	
	void print() {
		System.out.println("현재 남은 돈은 "+this.money+"입니다.");
		System.out.println("현재 보유 포인트는 "+this.bonusPoint+"입니다.");
	}
}
public class TestEx {
	public static void main(String[] args) {
		Buyer b=new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.print();
	}
}
