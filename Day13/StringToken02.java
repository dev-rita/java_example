import java.util.StringTokenizer;

public class StringToken02 {
	public static void main(String[] args) {
		StringTokenizer phone=new StringTokenizer("010-9999-9999","-");
		//회원정보에서 가장 많이 쓰임. '-'구분자를 기준으로 폰번호를 분리한다. 분리된 폰번호를 토큰 문자열이라고 한다.
		//토큰 문자열은 한번 사용하면 다시 사용할 수 없다. 다시 사용하려면 객체를 생성해야한다.
		//java에서는 많이 사용되고 다른 언어에서는 split가 사용됨.
		
		System.out.println("총 토큰의 개수 :"+phone.countTokens());//3개
		String phone01=phone.nextToken();//첫 번째로 분리된 폰번호를 가져옴.
		String phone02=phone.nextToken();
		String phone03=phone.nextToken();
		
		System.out.println("총 토큰의 개수 :"+phone.countTokens());
		//nextToken()으로 사용했기 때문에 토큰의 수는 0이다. 
		System.out.println("첫 번째로 분리된 폰 번호 :"+phone01);
		System.out.println("두 번째로 분리된 폰 번호 :"+phone02);
		System.out.println("세 번째로 분리된 폰 번호 :"+phone03);
		
		//System.out.println(phone.nextToken()); //다시 사용할 수 없기 때문에 에러
		
		StringTokenizer phone2=new StringTokenizer("010-5666-4444","-");
		System.out.println(phone2.nextToken()+phone2.nextToken()+phone2.nextToken());
		//위 프린트 메소드에서 phone2.nextToken()를 한번 더 추가하면 에러. (저장된 내용이 없기 때문, 010,5666,4444)
		
		StringTokenizer phone3=new StringTokenizer("010-8818-8834","-");
		
		while(phone3.hasMoreElements()) {//분리된 토큰 문자열이 있다면 참.
			System.out.println(phone3.nextToken());//분리된 폰 번호를 가져와서 출력
		}
		
		StringTokenizer Talk=new StringTokenizer("Hi! Nice to~ meet! you~","!~");
		//구분자는 하나가 아닌 여러개의 문자를 구분자로 할 수 있다.
		while(Talk.hasMoreElements()) {//분리된 토큰 문자열이 있다면 참.
			System.out.println(Talk.nextToken());//분리된 폰 번호를 가져와서 출력
		}	
	}
}
