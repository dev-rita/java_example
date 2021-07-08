
public class DataTest02 {

	public static void main(String[] args) {
		int a; //자료형 변수명 = 변수 선언법. ;은 문장 끝을 뜻함.
		a=1; //a변수에 최초값 1을 저장함. > 변수 초기화
		
		System.out.println("a="+a);
		
		a=10; // 변수에는 마지막에 저장된 한 개만 저장되고 그 이전 값은 사라짐. =은 대입연산자로 오른쪽 값을 왼쪽변수에 대입.
		
		System.out.println("a="+a);
		
		byte b=1;
		short c=128;
		int d=32768;
		
		c=b;//자동형 변환
		System.out.println("c="+c);
		
		c=(short)d; //4바이트 int를 더 작은 2바이트 short변수에 저장하려면 자동형변환이 안되므로 자료 손실위험을
		            //감수하고 (형변환 연산자) 즉 캐스팅 연산자를 사용하여 강제형변환을 한다.
		System.out.println("c="+c);//저장되는 값이 short의 최대값 범위를 벗어난 오버플로우 현상이 발생해서 결국 short 최솟값 출력.
		
	}

}
