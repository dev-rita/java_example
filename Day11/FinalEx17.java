class FinalMember{
	final int ABC=10;//상수
	public void setABC(int abc) {
		//ABC=abc; //상수는 수정할 수 없다.
	}
}
public class FinalEx17 {

	public static void main(String[] args) {
		FinalMember fm=new FinalMember();
		fm.setABC(100);
		System.out.println(fm.ABC);
	}

}
