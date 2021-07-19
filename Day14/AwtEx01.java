import java.awt.Frame;//java.awt.Frame을 import하면 AWT gui를 만들 수 있다.
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class FrameEx01 extends Frame{//Frame클래스를 상속받아서 AWT 프레임 윈도우 창을 만든다.
	public FrameEx01() {
		super("awt window");//super에서 인자를 문자열 영어로. UTF-8에서 한글이 깨지기 때문.
		//조상클래스 오버로딩 된 생성자를 호출하면서 윈도우 제목을 설정.
		setSize(300,400);//프레임 폭과 높이를 지정.
		setVisible(true);//항상 보이게 한다.
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {//필요한 메소드만 오버라이딩
				dispose();//자원해제하면서 닫기
				System.exit(0);//프로그램 종료.
			}//현재 프레임 윈도우 닫기 했을 때 호출.
		});//익명클래스 문법->외부클래스$번호.class(FrameEx01$1.class),윈도우 이벤트 등록 메소드
	}//생성자
}
public class AwtEx01 {
	public static void main(String[] args) {
		new FrameEx01();//생성자 호출.
	}
}

