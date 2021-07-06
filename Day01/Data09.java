
public class Data09 {

	public static void main(String[] args) {
		short sMin=-32768;
		short sMax=32767;
		
		System.out.println("sMin ="+sMin);
		System.out.println("sMin-1 ="+(short)(sMin-1)); //오버플로우로 자료값 손실. 이상한 값 출력됨.
		/* 문제> sMin-1을 하면 short 정수 기본타입 최소값 범위를 벗어나서 최대값이 출력된다.
		 * 이것을 원래값 -32769가 출력되게 해본다. 
		 * (*sMin-1은 sMin short타입이 뺄셈 속도 향상을 위해서 int 타입으로 변환이 되어 뺄셈을 한다는 것에 주의)
		 * byte, short등 타입은 자바 가상 머신의 피연산자를 4바이트로 저장하므로 속도에서 가장 빠른 int타입으로 변환된다.
		 * cpu에서 가장 빠른 연산속도를 내는 것이 int타입. 
		 * 자바는 더 큰 타입으로 변환되는 자동산술법에 의해서 자동형 변환이 이루어진다.
		 */
		System.out.println("sMin-1 ="+(sMin-1));
		//+(int)(sMin-1) 이부분은 계산 때 int 타입으로 바뀌기 때문에 캐스팅은 굳이 할 필요가 없다.
		
		System.out.println("sMax ="+sMax);
		System.out.println("sMax+1 ="+(short)(sMax+1));//(short)로 강제 캐스팅 즉 형변환을 하면 short
		                                              //최대값 범위를 벗어나서 결국 오버플로우 현상이 발생되어
		                                              //오버플로우 현상이 발생되어 short타입 최소값이 출력됨.
		System.out.println("sMax+1 ="+(sMax+1));
		
		double d=99.6;
		int result=(int) d;//반올림을 하지 않고 정수값만 구함.
		System.out.printf("result= %d점 %n",result);//%n은 줄바꿈
	}

}
