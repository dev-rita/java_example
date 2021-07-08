
public class Opr17 {

	public static void main(String[] args) {
		int d =3000000;
		int b =2000000;
		byte a =127;
		byte e =125;
		
		int g=a*e; // byte, char, short는 연산 효율성을 위해서 int타입으로 자동형변환이 되어져 연산이 수행된다.
		System.out.println(g);
		
		long re=d*b;
		System.out.println(re);
		//d*b하면 이상한값이 re에 저장되어 출력된다.
		
		re=(long)d*b;//long*int는 자동산술법에 의해서 long*long이 된다.
		System.out.println(re);
	
	}

}
