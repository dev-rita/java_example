class UserEx07 extends Exception{
	public UserEx07(String str) {//새롭게 정의한 예외 클래스의 생성자에 넘겨진 값을 슈퍼클래스인
		super(str);//Exception의 생성자에게 넘겨줌. 조상클래스 오버로딩 된 생성자 호출.
	}//생성자 오버로딩
}
public class TryEx07 {
	public static void main(String[] args) {
		try {
			int a=-10;
			if(a<=0) {
				throw new UserEx07("양수가 아닙니다.");//사용자가 정의한 예외를 인위적으로 발생시킴.
			}
		}catch(UserEx07 ue) {
			System.out.println(ue.getMessage());//에러 즉 경고 메시지 출력 >>너무 복잡함.
		}
	}
}

