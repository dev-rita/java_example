import java.util.HashMap;
import java.util.Scanner;

public class CollEx18 {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		/* java.util의 Map컬렉션 인터페이스를 구현한 컬렉션 클래스 HashMap특징>>
		 * 1.키, 값 쌍으로 저장, 키를 통해서 값을 검색. 사전적인 자료구조이다.
		 */
		
		map.put("abcde", "1234");//키 값 쌍으로 저장
		map.put("cdefg", "1234");//값 중복 가능
		map.put("asdf", "56789");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id :");
			String id=sc.nextLine().trim();//trim()메소드로 양쪽 공백을 제거.
			
			System.out.print("password :");
			String password=sc.nextLine().trim();
			System.out.println();//줄바꿈
			
			if(!map.containsKey(id)){//컬렉션(map)에 키(id)가 포함되어 있지 않으면 true
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;//아래문장 실행하지 않고 반복문 처음으로 돌아감.
			}else {
				if(!(map.get(id).equals(password))) {//비번이 다를때. >> id에대한 키와 비밀번호를 비교.
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
				}else {
					System.out.println("id와 비번이 일치합니다.");
					break;//무한 반복문 종료.
				}
			}
		}//무한 루프문
	}
}
