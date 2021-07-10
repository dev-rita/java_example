
public class Array18 {

	public static void main(String[] args) {
		String [] names= {"Kim","Park","Yi"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println("names["+i+"]:"+names[i]);
		}
		
		String result=names[2];
		System.out.println("result :"+result);
		
		names[0]="김";
		
		String rev=" ";
		//향상된 확장 for반복문으로 출력
		for(String str:names) {
			rev=str+rev;
			System.out.print(str+" ");
		}System.out.println("\n"+rev);
		
		String str="ABCDE";
		char ch=str.charAt(3);//charAt(3)은 첫글자를 0부터 시작해서 4번째 단일문자 'D'를 구함.
		System.out.println(ch);
		
		String tmp=str.substring(0,2);//0부터 시작해서 2미만사이의 문자열을 구함.
		System.out.println(tmp);
		
		System.out.println("\n==================================");
		//사용빈도 높음.
		for(int i=0;i<str.length();i++){//str.length는 문자열 길이를 반환, 문자열 길이는 1부터 샌다.
			char ch2=str.charAt(i);//첫 문자를 0부터 시작해서 i번 째 단일문자를 구함.
			System.out.println("str.charAt("+i+") :"+ch2);
		}
	}

}
