
public class String07 {

	public static void main(String[] args) {
		String fullName="Hello.java";
		int index=fullName.indexOf('.');
		String fileName=fullName.substring(0,index);//0이상 index(.)미만 사이의 file명 반환.(첫 문자 0부터 시작)
		System.out.println("파일명:"+fileName);
		
		String ext=fullName.substring(index+1);//index(.)이후 부터 마지막 문자까지 구함. 즉 확장자를 구함.
		System.out.println("확장자:"+ext);
	}

}
