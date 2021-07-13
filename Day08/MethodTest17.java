class Mt17{
	long add(int a, long b) {
		return a+b;
	}
	
	long add(long a, int b) {
		return a+b;
	}
}//매개변수 순서를 다르게 한 메소드 오버로딩
public class MethodTest17 {

	public static void main(String[] args) {
		Mt17 mt=new Mt17();
		System.out.println(mt.add(3, 5L));
		System.out.println(mt.add(5L, 3));
	}

}
