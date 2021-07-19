import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class FrameEx09 extends Frame implements WindowListener{
	//리스너 인터페이스에 추상메소드가 하나 이상인 경우는 별도의 어댑터 클래스가 존재한다. 
	//불필요한 추상메소드가 오버라이딩 되기 때문이다.
	public FrameEx09() {
		this.addWindowListener(this);//프레임 윈도우 내자신을 이벤트에 등록
		setSize(300,300);
		setVisible(true);
	}
	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}//아답터를 사용하지 않으면 불필요한 메소드도 다 오버라이딩을 해야한다.
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
public class EventEx09 {
	public static void main(String[] args) {
		new FrameEx09();
	}
}
