
public class DataTest05 {

	public static void main(String[] args) {
		String name="Ja"+"va";
		String str=name+8.0; //문자열+숫자는 문자열을 우선해서 숫자가 문자열로 변경된다.
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(5+5+"");//왼쪽에서 오른쪽 순으로 연산이 되기 때문에 5+5=10 이 되고, 10+""는 문자를 우선해서 "10"이됨.
		System.out.println(""+5+5);//""+5로 "5"+5가 되고 문자를 우선하므로 "55"가 된다.
	}

}
