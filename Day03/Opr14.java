
public class Opr14 {

	public static void main(String[] args) {
		int a=12;//0 1100 8+4=12
		int b=20;//1 0100 16+4=20
		int c;
		
		
		c=a&b;//(0 1100)&(1 0100)=0 0100
		System.out.println(a+"&"+b+"->"+c);

		c=a^b;//(0 1100)^(1 0100)=1 1000
		System.out.println(a+"^"+b+"->"+c);
		
		int f=0b1101110;//2진수 나타냄 십진수로 110
		System.out.println("0b1101110="+f);
		
		c=~a;//~(0000 1100)>> 1111 0011 >2의보수로 저장>0000 1100(1의보수)+1= -(0000 1101):음수는 2의 보수(1의 보수+1)로 저장.
		System.out.println("~"+a+":"+c);
		a=-13;
		c=~a;
		System.out.println("~"+a+":"+c);//~(1111 0011) >> 0000 1100
		
		byte x=15; 
		

		System.out.println("15<<2="+(x<<2)); //0000 1111 <<2 = 0011 0100 or A*(2^b) = 15<<2 = 15*(2^2)=60
		
	    f=0b00111100;//2진수 나타냄 십진수로 60
		System.out.println("00111100="+f);
		
		System.out.println("15>>2="+(x>>2));// 0000 1111 >>2 = 0000 0011 or A/(2^b)= 15>>2 = 15/(2^2)=3
		
		
	}

}
