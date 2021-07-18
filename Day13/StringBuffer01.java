
public class StringBuffer01 {

	public static void main(String[] args) {
		//StringBuffer는 자기 자신값을 수정 할 수 있다는 것이다. 메모리 활용이 좋지만 사용빈도가 높진 않음.
		//String은 자기 자신 값을 수정할 수 없다.
		StringBuffer str01=new StringBuffer();

		str01.append("Java");//append메소드로 버퍼 끝에 문자열 추가 (자기 자신 값 수정) 
		System.out.println("str01:"+str01.toString()); //toString()메소드로 문자열로 변경한다.
		str01.append(" Programming");//기존 문자에 추가해서 변경됨.
		System.out.println("추가된 str01:"+str01.toString());

		str01.replace(0, 4, "MFC");//0이상 4미만 사이의 내용을 Java(0~3)에서 MFC로 변경한다.
		System.out.println("변경된 str01:"+str01.toString());

		String str02=str01.substring(3);//첫문자를 0부터 시작해서 4번째 이후부터 마지막 문자까지 구함.
		System.out.println("str02:"+str02.toString());

		str01.deleteCharAt(0);//첫문자를 지움
		System.out.println("str01:"+str01.toString());

		str01.reverse();//문자를 역순으로 배치.
		System.out.println("역순으로 배치된 str01:"+str01.toString());
		
		StringBuffer sb=new StringBuffer("XX");
	      sb.append("YY");//sb의 내용 뒤에 "YY"추가
	      StringBuffer sb2=sb.append("ZZ");
	      //sb의 내용 뒤에 "ZZ"추가
	      System.out.println(sb);//XXYYZZ
	      System.out.println(sb2);//XXYYZZ

	      StringBuffer sb3=new StringBuffer("XX");
	      sb3.append("YY").append("ZZ");
	      System.out.println(sb3);//XXYYZZ
	}

}
