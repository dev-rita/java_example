class Card{
	String kind;//카드종류
	int number;//카드번호
	
	Card(){
		this("SPADE",1);//같은 클래스내의 다른생성자를 호출
	}
	
	Card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}//생성자 오버로딩
	
	//Object의 toString()메소드를 오버라이딩을 해서 kind, number값을 반환해보자.
	@Override
	public String toString() {
		return "kind :"+kind+", number :"+number;
	}
}
public class ObjectToString16 {

	public static void main(String[] args) {
		Card c01=new Card();
		Card c02=new Card("HEART",10);
		
		System.out.println(c01.toString());
		System.out.println(c02.toString());
		System.out.println(c01);//==c01.toString() 
		//객체명을 넣어도 toString()메소드가 저절로 호출된다.
		
	}
}
