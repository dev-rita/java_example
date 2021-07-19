import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class FrameEx091 extends Frame implements WindowListener{ //불필요한 메서드 다 오버라이딩
	//>addWindowListener(new WindowAdapter() {});(별도의 어댑터 클래스가 존재)

	public FrameEx091() {
		this.addWindowListener(this);//프레임 윈도우 내자신을 이벤트의 등록
		setSize(200,200);
		setVisible(true);
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
	dispose();System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	
	
}
public class test {

	public static void main(String[] args) {
		new FrameEx091();
	}

}
