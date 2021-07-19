import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx07 extends Frame{
	Button redBtn, blueBtn;

	public FrameEx07() {
		setLayout(new FlowLayout());

		redBtn=new Button("RED");
		blueBtn=new Button("BLUE");
		add(redBtn);
		add(blueBtn);

		ButtonListener2 handler=new ButtonListener2(this);
		//생성자 호출하면서 프레임 내자신 정보를 전달. this=FrameEx07

		redBtn.addActionListener(handler);//각 버튼 이벤트 등록
		blueBtn.addActionListener(handler);
		//이벤트 소스인 버튼에 이벤트 처리를 할 이벤트 리스너 객체 등록.
		//if class FrameEx07 extends Frame implements ActionListener이면
		//redBtn.addActionListener(this); >> 버튼을 멤버로 갖는 FrameEx07 자기 자신이 이벤트 리스너 객체이므로 this로 등록.
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}//생성자
}

class ButtonListener2 implements ActionListener{
	Frame frm=null;
	
	public ButtonListener2() {}
	
	public ButtonListener2(Frame value) {
		frm=value;//frm에 FrameEx07객체의 프레임이 넘어온다.
	}//생성자 오버로딩
	
	@Override
	public void actionPerformed(ActionEvent e) {//운영체제가 호출하는 메소드
		if(e.getActionCommand()=="RED") {//getActionCommand()메소드는 버튼위의 캡션 문자열을 반환
			frm.setBackground(Color.RED);//프레임 배경색을 빨강색으로 변경. 상속받지 않았기 때문에 frm을 가리키는 객체가 필요.
		}else {
			frm.setBackground(Color.BLUE);
		}
	}
}
public class EventEx07 {

	public static void main(String[] args) {
		new FrameEx07();
	}

}
