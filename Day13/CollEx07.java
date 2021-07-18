import java.util.LinkedList;

public class CollEx07 {

	public static void main(String[] args) {
		
		/* java.util의 Queue 컬렉션 인터페이스를 구현한 LinkedList컬렉션 특징>>
		 * 1.입구와 출구가 다르다. 그러므로 먼저 입력된 자료가 먼저 출력된다.
		 * 2.FIFO(First In First Out)구조.
		 */
		
		LinkedList myQue=new LinkedList();
		myQue.offer("1-java");
		myQue.offer("2-jsp");
		myQue.offer("3-Oracle");//큐에 값을 저장함.
		
		while(myQue.peek()!=null) {//큐가 null이 아니면 참
			System.out.println(myQue.poll());//큐에서 데이터를 꺼내옴.
		}
	}
}
