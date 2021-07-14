class St18{
	static int a=10;//정적변수
	int b=20;//인스턴스 변수
	
	public void print() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("this.b="+this.b);//this.은 생략 가능하다.
	}//인스턴스메소드. static 정적메소드에는 인스턴스 변수와 this.사용이 불가하다.
}
public class InstanceEx18 {

	public static void main(String[] args) {
		St18 st=new St18();
		st.print();
	}

}
