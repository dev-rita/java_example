class Mt02{
	void p(int a,int b) {
		System.out.println(a+"\t"+b);
	}
	
	/*void p(int x,int y) {
		System.out.println(a+"\t"+b);
	}매개변수의 이름만 다를 뿐 매개변수의 타입이 같아서 성립 x*/
	
	void p(int a) {
		System.out.println(a);
	}//전달인자 개수를 다르게 한 메소드 오버로딩
}
public class MethodTest02 {

	public static void main(String[] args) {
		Mt02 m=new Mt02();
		m.p(100);
		m.p(100,200);
	}

}
