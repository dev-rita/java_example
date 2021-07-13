
public class Ex6_18 {
	static boolean isNumber(String str) {
		boolean result=true;
		
		if(str==null || str.equals(""))
			return false;
		
		for(int i=0;i<str.length();i++) {
			if('0'<=str.charAt(i)&&str.charAt(i)<='9') {
				result=true;
			}else {
				result=false; 
				break;}
		}
		return result;
	}
	public static void main(String[] args) {
		
		String str="\"";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str="";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str="12345o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str="24o321";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}
}
