public class StringEx19 {
	public static void main(String[] args) {
		//String 객체는 자기 자신 내용을 수정할 수 없다. 문자열이 수정되면 자기자신 문자열 객체가 변경되는 것이 아니라 
		//새로운 문자열 객체가 생성되고 그 객체를 되돌려준다.
		String str01="Java Programming";
		System.out.println("영문대문자로 변경: "+str01.toUpperCase());

		String str02="Java";
		String str03=new String(" Programming");

		System.out.println("\'Java\'의 문자열 길이:"+str02.length());//문자열 길이를 카운터할 대는 1부터 시작한다.
		String result=str02.concat(str03);//두 문자열을 결합
		System.out.println("두 문자 연결:"+result);

		System.out.println("\'Java\'에서 3 번째 문자:"+str02.charAt(2));
		//charAt(2) 첫문자를 0부터 카운터해서 즉 3번째 단일문자를 구함.
		System.out.println("\' Programming\'에서 r이 몇 번째 저장되었는가?"+(str03.indexOf('r')+1));
		//indexOf('r')은 'r'을 맨 왼쪽에서 부터 찾아서 가장 먼저 나오는 'r'의 위치 번호를 왼쪽 첫문자 0부터 시작해 구한다.
		//공백 0, P 1, r 2, indexOf('r')은 2이지만 +1을 해 3이나온다.

		//자바 내장 클래스 및 메소드를 사용하지 않고 자바 코드로 만들어 내면 객체지향에 좋지 않다. (가독성이 좋지 않음. 유지보수 안좋음.)
		//연산이 많아질수록 코드라인이 길어지고 시간도 많이걸린다.
		
		/*' Programming'에서 'r'을 맨 오른쪽에서 부터 찾아서 가장 먼저 나오는 위치번호를 구하시오. */
		System.out.println("\' Programming\'에서 r을 맨 오른쪽부터 찾았을 때 최초 위치번호는?"+(str03.lastIndexOf('r')+1));
		//lastIndexOf('r')는 'r'을 맨 오른쪽부터 찾아서 가장 먼저 나오는 해당문자의 위치번호를 왼쪽에서부터 카운트해서 출력.(0부터)
		
		//length 와 charAt와 indexOf와 lastIndexOf 가 제일 많이 쓰임.
		//일단 기능 메소드를 먼저 찾고 없으면 코드 작성
	}

}
