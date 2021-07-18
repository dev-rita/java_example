import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		//Calendar는 추상클래스로 new로 객체 생성을 못한다. 하지만 년/월/일, 시/분/초 값을 반환할 때 많이 사용된다.
		//getInstance()메소드로 Calendar의 자손클래스 GregorianCalendar()객체 생성.
		//Calendar의 getInstance()메소드를 가지고, getInstance()메소드는 자손클래스 GregorianCalendar()객체를 리턴.
		
		int year=cal.get(Calendar.YEAR);//년도값
		int month=cal.get(Calendar.MONTH)+1;//월값, +1한 이유는 1월이 0으로 반환되기 때문이다.
		int date=cal.get(Calendar.DATE);//일값
		int hour=cal.get(Calendar.HOUR_OF_DAY);//24시간 값
		int min=cal.get(Calendar.MINUTE);//분값
		int sec=cal.get(Calendar.SECOND);//초값
		
		System.out.println(year+"/"+month+"/"+date+"\n"+hour+"/"+min+"/"+sec+"입니다.");
	}
}
