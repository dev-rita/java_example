import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EventEx08 extends Frame implements ActionListener{
	
	Button redBtn, blueBtn;
	
	public EventEx08 () {
		setLayout(new FlowLayout());//배치관리자 지정
		redBtn=new Button("RED");
		blueBtn=new Button("BLUE");
		add(redBtn);//각 버튼을 프레임에 추가.
		add(blueBtn);//각 버튼을 프레임에 추가.
		
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});//윈도우 닫기 눌렀을 때 호출
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==redBtn) {//getSource()메소드는 이벤트 소스 객체를 구함.
			this.setBackground(Color.RED);//프레임 배경색을 빨강색으로 변경. 상속받았기 때문에 this로 자기 객체를 가리킴.
		}else {
			this.setBackground(Color.BLUE);
		}
	}//버튼클릭 했을 때 호출.
	
}
public class FrameEx08 {

	public static void main(String[] args) {
		new EventEx08();
		}

}
