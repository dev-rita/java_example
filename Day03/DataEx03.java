
public class DataEx03 {

	public static void main(String[] args) {
		byte var1=127;
		short var2=128;
		int var3=128;
		long var4=128L;
		
		var4=var1;//byte형이 long형으로 자동형 변환
		System.out.println(var1+","+var2);
		
		var1=(byte)var3;//더 큰타입 int를 작은 타입인 byte형에 담으려면 캐스팅연산자를 명시적으로 사용해야한다. 
		                //byte형 최대값 범위를 벗어난 오버플로우 현상이 일어난다.
		System.out.println(var1+","+var3);
		
		float var5=123456.789123f;
		double var6=123456.789123;
		
		var5=(float)var6;
		System.out.println("(float)var5에 double인 var6을(float)var6로 대입="+var5+",var6="+var6);
		
		var6=var5;
		System.out.println("(float)var6="+var5+",(double)var6에 (float)var5 대입"+var6);
	}

}
