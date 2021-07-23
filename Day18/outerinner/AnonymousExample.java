package outerinner;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous an=new Anonymous();
		an.field.wake();//field에서 wake()호출.
		an.method1();
		an.method2(
		new Person() {
			void study() {
				System.out.println("공부를 합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}		
		});//익명객체 >AnonymousExample$1.class로 컴파일됨.
	}
}
