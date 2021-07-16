class FinalMethod18{
	String str="Java";
	
	public final void setStr(String str) {//메소드를 final로 정의하면 더이상 오버라이딩을 허용하지 않는다.
		this.str=str;
	}
}

class FinalExTest extends FinalMethod18{
	int a=10;	
	/*@override
	public void setStr(String str) {
		
	}//>>컴파일 에러*/
}
public class FinalEx18 {

	public static void main(String[] args) {
		
	}

}
