
public class DataTest10 {

	public static void main(String[] args) {
		int i=10;
		byte b=(byte)i;
		System.out.printf("[int -> byte]%d -> %d %n",i,b);
		
		i=300;
		b=(byte)i;//byte형 범위를 벗어나서 자료 손실이 발생한다.
		System.out.printf("[int -> byte]%d -> %d %n",i,b);
		
		b=10;
		i=(int)b;
		System.out.printf("[byte -> int]%d -> %d %n",b,i);
		
		b=-2;
		i=b;
		System.out.printf("[byte -> int]%d -> %d",b,i);
	}

}
