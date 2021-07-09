public class EqualsTest02 {
	public static void main(String[] args) {
		String str01="abc";
		String str02=new String("abc"); //new 연산 키워드로str02즉 문자열 객체를 생성하면 새로운 객체주소가 할당된다.
		
		System.out.printf("\"abc\"==\"abc\"?%b %n","abc"=="abc");
		//%b는 boolean타입, %n은 줄바꿈, ==는 같다 연산으로 문자열 값 비교에서는 주소값을 비교한다.
		
		System.out.printf("(str01)\"abc\"==\"abc\"?%b %n",str01=="abc");//주소값이 같아서 true
		
		System.out.printf("(str01)\"abc\"==(str02)new String(\"abc\")?%b %n",str01==str02);
		//주소값이 달라서 false, 문자열 같다 비교에서는 ==연산을 사용하면 안된다.
		//왜냐하면 값을 비교하는 것이 아니라 주소값을 비교하기 때문이다.
		
		System.out.printf("str01.equals(\"abc\")?%b %n",str01.equals("abc"));
		System.out.printf("str02.equals(\"abc\")?%b %n",str02.equals("abc"));
		//문자열값 같다 비교는 결국 equals()메소드를 사용해야한다. 값 내용을 비교하기 때문이다.
		
		System.out.printf("str02.equals(\"ABC\")?%b %n",str02.equals("ABC"));
		//equals()메소드는 대소문자를 구문하므로 false.
		
		System.out.printf("str02.equalsIgnoreCase(\"ABC\")?%b %n",str02.equalsIgnoreCase("ABC"));
		//equalsIgnoreCase()메소드는 대소문자를 구분하지 않으므로 true. (사용 잘 안함.)
		
		//결론적으로 문자열 값에서 같다는 내용물 값만 비교하는 equals()메소드를 사용해야 한다.
		// 회원 아이디 비번 로그인에서 자주 사용되는 메소드이다.
		 
		 
		
		
	}

}
