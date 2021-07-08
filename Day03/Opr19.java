
public class Opr19 {

	public static void main(String[] args) {
		char c1='a';
		char c2=c1;
		char c3=' ';
		
		int i=c1+1;//97+1
		System.out.println(i);
		
		c3=(char)(c1+1);//97+1=98로 98에 해당되는 'b'가 대입된다.
		System.out.println(c3);
		
		c2++;//증감연산자는 자동산술은 하지 않는다.
		System.out.println(c2);
	}

}
