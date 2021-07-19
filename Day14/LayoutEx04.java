import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class FrameEx04 extends Frame{
	public FrameEx04() {
		setLayout(new GridLayout(3,2));//3행*2열의 그리드 레이아웃 배치
		this.add(new Button("Button 01"));//프레임 윈도우에 버튼 추가.
		add(new Button("Button 02"));
		add(new Button("Button 03"));
		add(new Button("Button 04"));
		add(new Button("Button 05"));
		add(new Button("Button 06"));
		//add(new Button("Button 07")); //추가하면 지정한 행열 깨짐

		setSize(200,300);
		setVisible(true);

		addWindowListener(new WindowAdapter( ) {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}//생성자 끝
}
public class LayoutEx04 {
	public static void main(String[] args) {
		new FrameEx04();
	}
}
