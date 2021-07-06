
public class Data06 {

	public static void main(String[] args) {
		String name ="Ja"+"va";//+는 문자열 연결연산 기호
		String result=name+8.0;//문자+숫자에서 자바는 문자를 우선해 숫자가 문자로 변경된다.
		
		System.out.println("name변수값="+name);
		System.out.println("result변수값="+result);
		System.out.println(7+7+"");//왼쪽에서 오른쪽으로 연산이 수행되어 7+7에서는 덧셈해 14가 나오고,
		                           //14+""에서 ""우선해서 문자열"14"로 변경된다. 즉 "14"+""되어 결국 "14"가됨.

		System.out.println(""+5+5);//왼쪽에서 오른쪽으로 연산이 수행되어 ""+5는 "5"가 되고, "5"+5에서 문자를
		                           //우선해서 숫자 5가 "5"가 되어 "5"+"5"="55"가 된다.
	}

}
