package outerinner;

public class Anonymous3 {
	private int field;
	
	public void method(final int arg1, int arg2) {//final 생략
		final int var1=0;
		int var2=0;//final 생략
		
		field=100;
		
		Calculatable calc=new Calculatable() {
			
			@Override
			public int sum() {
				int result=field+arg1+arg2+var1+var2;
				return result;
			}};//익명객체 > Anonymous3$1.class, 
			//익명객체가 메소드의 매개변수나 지역변수를 사용하면 해당 변수는 final상수가 되어야 한다.
			//익명객체는 메모리에 남아있지만, 매개변수와 지역변수는 사라짐. 메소드를 호출할 때 값이 변경되면 안되기 때문.
			
			System.out.println(calc.sum());
	}//method 끝
}
