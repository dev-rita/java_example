import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx10 extends Frame{
	public FrameEx10() {
		setSize(200,200);
		setVisible(true);
		
		addWindowListener(new EventClass());//이벤트 등록
	}//생성자
	
	//이벤트 처리 클래스
	class EventClass extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			dispose();
			System.exit(0);
		}
		
	}//내부클래스 >> 외부클래스명$내부클래스명.class(FrameEx10&EventClass.class)
	
}//외부클래스
public class EventEx10 {

	public static void main(String[] args) {
		new FrameEx10();
	}

}
