import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx11 extends Frame{
	public FrameEx11() {
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
			
		});//익명클래스 문법>>FrameEx11$1.class
	}
}
public class EventEx11 {

	public static void main(String[] args) {
		new FrameEx11();
	}

}
