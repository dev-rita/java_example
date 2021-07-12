
public class MethodEx07 {

	static void sum(int size) {//int size를 매개변수 또는 전달인자라고 한다.
		//매개변수에 저장되는 값을 인자 값. 즉, parameter라고 한다.
		int i;//지역변수이면서 반복문 제어변수
		int total=0;//누적합을 저장하는 지역변수이다. 지역변수는 해당 {}블록에서만 실행된다. 벗어나면 사용 못함.
		//지역변수는 선언과 동시에 반드시 초기화를 해야한다.
		
		for(i=1;i<=size;i++) {
			total += i;//total=total+i와 같다.
		}
		
		System.out.println("1부터 "+size+"까지의 누적합="+total);
	}
	public static void main(String[] args) {
		sum(5);//메소드 호출할 때 전달되는 인자값이 5
		sum(10);//메소드 호출할 때 전달되는 인자값이 10
	}

}
