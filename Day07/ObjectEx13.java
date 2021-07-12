class Tv13{
	int channel;
}
public class ObjectEx13 {

	public static void main(String[] args) {
		Tv13 t01=new Tv13();
		Tv13 t02=new Tv13();
		
		System.out.println("t01.channel="+t01.channel);
		System.out.println("t02.channel="+t02.channel);
		
		if(t01==t02) {System.out.println("주소가 같다");}
		else {System.out.println("주소가 다르다.");}
		
		t02=t01;//t01과 t02가 같은 객체 주소를 가지게됨.
		
		if(t01==t02) {System.out.println("주소가 같다");}
		else {System.out.println("주소가 다르다.");}
		t01.channel=7;//같은 주소이기 때문에 t02.channel에도 7이 대입됨.
		
		System.out.println("t01.channel="+t01.channel);
		System.out.println("t02.channel="+t02.channel);
		
		
	}

}
