import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class FrameEx06 extends Frame{
	Button redBtn, blueBtn;
	
	public FrameEx06() {
		setLayout(new FlowLayout());
		
		redBtn=new Button("RED");
		blueBtn=new Button("BLUE");
		add(redBtn);
		add(blueBtn);//각 버튼을 프레임에 추가.
		
		ButtonListener handler=new ButtonListener();
		
		redBtn.addActionListener(handler);//각 버튼 이벤트 등록
		blueBtn.addActionListener(handler);
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}//윈도우 닫기 버튼 클릭했을 때 호출됨.	
		});
	}//생성자
}

//별도의 버튼 이벤트 처리클래스를 생성
class ButtonListener implements ActionListener{ //ActionListener가 버튼 이벤트 처리 리스너 인터페이스
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭됨.");
	}//버튼 클릭했을 때 호출
}

public class EventEx06 {
	public static void main(String[] args) {
		new FrameEx06();
	}
}
