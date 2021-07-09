
public class SwitchTest13 {

	public static void main(String[] args) {
		String Country_name="Korea";
		char ch=Country_name.charAt(0);//Korea에서 첫 단일문자를 구함.
		
		switch(ch) {
		case 'A': case'a' :{
			System.out.println("미국");
			break;
		}
		case 'C': case'c' :{
			System.out.println("캐나다");
			break;
		}
		case 'K': case'k' :{
			System.out.println("대한민국");
			break;
		}
		}
	}

}
