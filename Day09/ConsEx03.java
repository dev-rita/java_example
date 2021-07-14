class Board03{
	String writer;
	String title;
	String cont;
	
	Board03(){
		writer="이순신"; title="게시판 제목01"; cont="게시판 내용01";
	}//기본 생성자
	
	Board03(String new_writer, String new_title, String new_cont){
		writer=new_writer;
		title=new_title;
		cont=new_cont;
	}//전달인자 개수가 다른 생성자 오버로딩
	
	void print() {
		System.out.println("게시판 글쓴이:"+writer+" 제목:"+title+" 내용:"+cont);
	}
}
public class ConsEx03 {

	public static void main(String[] args) {
		Board03 b=new Board03();//기본 생성자 호출
		b.print();
		new Board03().print();//new 연산자 > 객체를 생성
		new Board03("홍길동","게시판 제목02","게시판 내용02").print();
		
		Board03 b2=new Board03("홍길동","게시판 제목02","게시판 내용02");
		b2.print();
	}

}
