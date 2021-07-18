
public class StringBuffer08 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");//각 주소값이 다르다. 내용물은 같다.
		
		System.out.println("sb == sb2"+(sb==sb2));//각 객체 주소값을 비교한다. false.
		System.out.println("sb.equals(sb2)>>"+sb.equals(sb2));
		//StriugBuffer에는 equals() 메소드가 오버라이딩이 되어있지 않다.
		//그래서 Object 클래스의 equals()메소드를 상속받아서 비교하기 때문에 주소값을 비교한다.
		
		//StringBuffer의 내용을 String으로 변환.
		String s=sb.toString();//String s=new String(sb)와 같음.
		String s2=sb2.toString();//문자열로 변경
		
		System.out.println("s.equlas(s2)>>"+s.equals(s2));
		//오버라이딩 된 equals()메소드를 사용.
	}

}
