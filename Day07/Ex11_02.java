class Product{
	private String name;
	private int price;
	
	void setName(String new_name) {
		this.name=new_name;
	}	
	String getName() {
		return name;
	}
	void setPrice(int new_price) {
		price=new_price;
	}	
	int getPrice() {
		return price;
	}
}
public class Ex11_02 {

	public static void main(String[] args) {
		Product p01=new Product();
		Product p02=new Product();
		
		p01.setName("커피");p01.setPrice(150);
		System.out.println("출력 : 자판기 => 제품목록");
		System.out.println(p01.getName()+"\t"+p01.getPrice()+"원");
		
		p02.setName("비타500");p02.setPrice(500);
		System.out.println("출력 : 자판기 => 제품목록");
		System.out.println(p02.getName()+"\t"+p02.getPrice()+"원");
	}

}
