public class Wrapper17 {

	public static void main(String[] args) {
/* 래퍼(Wrapper)클래스란?
 * 1.래퍼클래스는 자바의 기본타입 8개를 포장해서 클래스화 한것을 말한다.
 * 2.래퍼클래스의 종류
 *   기본자료형	참조자료형
 *    byte		 Byte
 *    short		 Short
 *     int	 	Integer
 *     long		 Long
 *    float   	 Float
 *    double	 Double
 *    boolean	Boolean
 *     char		Character
 *     
 *  jdk1.5에서 추가된 문법종류>>
 *  1. 오토박싱 : 기본타입이 래퍼클래스형으로 자동형 변환 되는 것을 말한다.
 *  2. 오토언박싱 : 래퍼클래스형이 기본타입으로 형변환 하는 것을 말한다.   
 */
		int n01=10;
		int n02;
		Integer num01;
		Integer num02=new Integer(20);//취소선은 앞으로 없어질 것 같은 코드.
		
		num01=n01;//오토박싱
		System.out.println("오토박싱 된 값 :"+num01);
		
		n02=num02;//오토언박싱
		System.out.println("오토언박싱 된 값:"+n02);
	}

}
