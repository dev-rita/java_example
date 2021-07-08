
public class DataTest09 {

	public static void main(String[] args) {
		short sMin=-32768;
		short sMax=32767;
		
		System.out.println("sMin= "+sMin);
		System.out.println("(short)(sMin-1) = "+(short)(sMin-1));
		//sMin-1에서 short타입값이 int타입으로 자동형변환이 이루어진다.
		//결과도 int형이다. 이것을 더 작은 타입에 캐스팅 즉 형변환 연산자로
		//강제형변환하다 보니 short최소 값 범위를 벗어나서 결국 오버플로우
		//현상이 발생해 short타입 최대값이 출력됨.
		
		System.out.println("sMin-1 = "+(sMin-1));//자동으로 int로 변환해 계산
		
		System.out.println("sMax= "+sMax);
		System.out.println("(short)(sMax+1) = "+(short)(sMax+1));
		//short타입으로 강제 형변환을 하면 최대값 범위를 벗어나서 최소값이 출력.
		
		System.out.println("sMax+1 = "+(sMax+1));//자동으로 int로 변환해 계산
		
/* 자바의 자동산술 변환 즉 자동형 변환)
 * 1. 자바는 작은 타입에서 더 큰타입으로 변환을 할 때는 자료 손실위험이 없기 때문에 자바컴파일러가 알아서 자동형변환을 해준다.
 * 2. 작은 타입에서 더 큰타입 순서
 *   byte 1바이트 > char,short 2바이트 > int 4바이트 > long 8바이트 > float 4바이트 > double 8바이트
 *   
 *   byte, char, short타입은 연산 효율성을 위해서 int타입으로 자동형변환이 되어져 연산이 수행되고, long타입 보다는 float타입이 더 크다.
 */
		double d =85.6;
		int score =(int) d;//실수타입을 int타입으로 형변환을 하면 반올림을 하지 않고 소수점이하는 버린다.
		System.out.println("score= " + score);
	}

}
