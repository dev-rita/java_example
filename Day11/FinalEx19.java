final class FinalClass{//클래스를 final로 선언하면 더이상 상속을 하지 못한다.
	private int a=10;
	public void setA(int a) {
		this.a=a;
		System.out.println(a);
	}

	public int getA() {
		return a;
	}
}
/*class Childclass extends Finalclass{//FinalClass를 상속하지 못한다.
	
}*/
public class FinalEx19 {

	public static void main(String[] args) {

	}

}
