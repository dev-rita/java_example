class Product{
	static int count=0, count1=0;//정적변수. 생성된 객체에 의해서 값을 공유>>누적 카운터
	int serialNo;//각 객체마다 고유번호>>객체마다 주소값이 다르기 때문에 각각 다른값을 가진다.

	static{
		++count1;
	}
	
	{	++count;
		serialNo=count;
	}//인스턴스 초기화 블록.
	
	public Product() {}//기본 생성자.
}
public class BlockEx13 {

	public static void main(String[] args) {
		Product p01=new Product();
		Product p02=new Product();
		Product p03=new Product();//p01, p02, p03 각 객체주소는 다르다.
		
		System.out.println("p01 제품번호:"+p01.serialNo+"/"+Product.count1);
		System.out.println("p02 제품번호:"+p02.serialNo+"/"+Product.count1);
		System.out.println("p03 제품번호:"+p03.serialNo+"/"+Product.count1);
		//count가 static변수이기 때문에 값이 공유되므로 count++하면 값이 누적이된다.
	}

}
