import com.naver.model.BoardVO;//이클립스 개발툴 기준으로 외부 패키지 클래스 읽어오는 단축키는 ctrl+shift+o

public class BoardEx21 {

	public static void main(String[] args) {
		BoardVO b=new BoardVO();//ctrl+shift+o
		
		b.setWriter("홍길동");
		b.setTitle("게시판 제목 입니다.");
		b.setCont("게시판 내용 입니다.");
		
		String name=b.getWriter();
		System.out.println("글쓴이 :"+name);
		System.out.println("제목:"+b.getTitle());
		
		String cont=b.getCont();
		System.out.println("내용:"+cont);
		
		b.print();
	}
}
