class Mt04{	
//	void p(int a) {
//		System.out.println(a);
//	}// 이 메소드와 같이 있으면 이 메소드가 우선시 된다.
	
	/* int ... 배열명은 자바 1.5에서 추가된 가변인자 문법이다. 
	 * 이 문법은 매개변수 개수가 다른 메소드가 오버로딩 된경우 그 인자 개수만큼 가변인자로 받아서 배열로 처리하면 
	 * 한 개의 메소드만 정의하면 된다. 그만큼 코드줄 수가 줄어드는 장점이 있다. 가변인자 문법을 사용하지 않으면,
	 * 인자개수만큼 중복 메소드명을 오버로딩 시켜야 한다. 그만큼 불필요한 코드라인이 늘어난다.
	 */
	void p(int ... arr) {
		System.out.println("인자 개수="+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println("\n====================");
	}
	//향상된 확장 for반복문으로 인자값을 출력해보자.
	void pr(int ...arr2) {
		for(int k:arr2) {
			System.out.print(k+" ");
		}System.out.println("\n====================");
	}
}
public class MethodTest04 {

	public static void main(String[] args) {
		Mt04 m=new Mt04();
		m.p(10);
		m.p(10,20);
		m.p(10,20,30);
		System.out.println("pr()메소드 호출");
		m.pr(10);
		m.pr(10,20);
	}

}
