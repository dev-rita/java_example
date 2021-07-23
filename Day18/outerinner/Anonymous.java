package outerinner;

public class Anonymous {

	//필드 즉 멤버변수 초기값으로 대입
	Person field=new Person() {

		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};//익명 객체. > 외부클래스$번호.class (Anonymous$1.class)
	
	
	void method1() {
		//지역변수값으로 대입
		Person localVar=new Person() {

			void walk() {
				System.out.println("산책을 합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};//익명 객체. > 외부클래스$번호.class (Anonymous$2.class)
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}	
}
