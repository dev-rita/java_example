import java.util.Stack;

public class CollEx06 {

	public static void main(String[] args) {		
		Stack myStack=new Stack();
		/*java.util패키지의 컬렉션 클래스 Stack 특징>>
		 * 1.jdk 1.0에서 추가됨.
		 * 2.입구와 출구가 같다.
		 * 3.가장 먼저 입력된 것이 가장 나중에 나오는 자료구조이다.(FILO>First In Last Out)
		 * 4.가장 나중에 입력된 것이 가장 먼저 나오는 구조이다.(LIFO>Last Input First Out)
		 */
		
		myStack.push("1-java");//스택 맨 위에 추가
		myStack.push("2-oracle");
		myStack.push("3-jsp");
		
		while(!myStack.isEmpty()) {//스택에 값이 비어있지 않다면 참.
			System.out.println(myStack.pop());//스택의 맨 위 값을 제거하면서 꺼내옴.>>입력된 값 역순으로 출력됨
		}
	}
}
