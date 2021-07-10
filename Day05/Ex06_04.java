//A부터 Z사이의 알파벳 출력하는 프로그램을 작성하시오.
public class Ex06_04 {
	public static void main(String[] args) {
		
		for(int a='A';a<='Z';a++)
		{			
			System.out.printf((char)a+" ");
		}
		
		System.out.println();
		
		for(char a='A';a<='Z';a++) {
			System.out.print(a+" ");//증감연산자는 형변환을 하지 않는다.
		}
		
	
		
	}
	}

