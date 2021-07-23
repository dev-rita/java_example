package enum_test;
import java.util.Calendar;
public class EnumWeek07 {

	public static void main(String[] args) {
		Week today =null;//열거타입 변수선언, 열거 타입은 레퍼런스 즉 참조타입이다.
		Calendar cal=Calendar.getInstance();
		//Calendar는 추상클래스로 new로 객체 선언을 못함. 하지만 년, 월(+1), 일, 시, 분, 초값을 반환할 때 많이 사용한다.(물론 요일값도 반환)

		int week=cal.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지 정수 숫자 반환
		switch(week){
		case 1:
			today= Week.SUNDAY; break;//열거상수 대입
		case 2:
			today= Week.MONDAY; break;//열거상수 대입
		case 3:
			today= Week.TUESDAY; break;//열거상수 대입
		case 4:
			today= Week.WEDNSDAY; break;//열거상수 대입
		case 5:
			today= Week.THURSDAY; break;//열거상수 대입
		case 6:
			today= Week.FRIDAY; break;//열거상수 대입
		case 7:
			today= Week.SUNDAY; break;//열거상수 대입
		}
		System.out.println("오늘은 "+today+"입니다.");
		if(today ==Week.SUNDAY) {
			System.out.println("일요일에는 쉽니다.");
		}else {
			System.out.println("공부합니다.");
		}
		
		Week today1=Week.TUESDAY;//1
		if(today1==Week.TUESDAY) {//true
			System.out.println("오늘은"+today1+"가 아닌 "+today+"입니다.");
		}
		if(today1==Week.MONDAY) {//false(1==0)
			System.out.println("오늘은"+Week.MONDAY);
		}else if(today1.compareTo(Week.MONDAY)>=0) {//1>0으로 양수 반환으로 true
			//열거형 상수간 비교에서는 <, >와 같은 비교연산자는 사용할 수 없고,
			//compareto()는 사용이 가능하다. 두 비교대상이 같으면 0, 왼쪽이 크면 양수,
			//오른쪽이 크면 음수를 반환한다.
			System.out.println("오늘은"+today);
		}
	}
}
