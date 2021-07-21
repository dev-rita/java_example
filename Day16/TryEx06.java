
public class TryEx06 {
	static void p (int a) throws NullPointerException{//메소드 호출한 곳으로 예외를 떠넘김
		if(a==0) {//예외발생
			throw new NullPointerException();//인위적 예외 발생
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("예외 발생 전");
			p(0);//인위적 예외 발생함. 아래문장 실행 안함.
			System.out.println("예외 발생 후");
		}catch(NullPointerException e) {//예외를 받아서 아래 문장 실행함.
			System.out.println("예외 처리함: "+e);
		}
	}
}
