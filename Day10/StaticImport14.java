import static java.lang.System.*;
import static java.lang.Math.*;
//static import문을 사용하면 static멤버(정적변수(상수),정적메소드)를 호출할 때 해당 클래스명을 생략할 수 있다.
//코드가 간결해지는 효과가 있다. (잘 사용은 안된다.)
public class StaticImport14 {

	public static void main(String[] args) {
		out.println(random());//Math.와 System.이 생략됨. 
		out.println(PI);
	}

}
