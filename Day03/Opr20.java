
public class Opr20 {

	public static void main(String[] args) {
		
		char c='a';
		for (int i=0;i<26;i++) {
			System.out.print(c++);//증감연산자는 자동산술을 하지 않기 때문에 증가가 int타입으로 되지 않음.
		}
		
		System.out.println();
		
		c='A';
		for (int i=0;i<26;i++) {
			System.out.print(c++);//증감연산자는 자동산술을 하지 않기 때문에 증가가 int타입으로 되지 않음.
		}
		
		System.out.println();
		
		c='0';
		for (int i=0;i<10;i++) {
			System.out.print(c++);//증감연산자는 자동산술을 하지 않기 때문에 증가가 int타입으로 되지 않음.
		}
		
		System.out.println();
		
		char lowerCase='a';
		//영문 소문자 a(97)를 대문자 A(65)로 구해보는 코드를 완성하자.
		lowerCase-=32;
		System.out.print(lowerCase);
		
		System.out.println();
		
		lowerCase='a';
		char uppercase=(char)(lowerCase-32);
		System.out.print(uppercase);//97-32=65, 65에 해당하는 단일 문자는 'A'
		
	}

}
