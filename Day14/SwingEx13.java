import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame13 extends JFrame{
	JButton btn01;
	private JButton btn02, btn03;
	
	public MyFrame13() {
		setTitle("절대좌표로 위치지정(임의로 지정한다는 뜻)");//스윙 프레임 윈도우 제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//스윙 프레임 윈도우 닫기
		setSize(400,200);
		JPanel p=new JPanel();
		p.setLayout(null);//배치관리자를 설정하지 않고 개발자가 임의로 각 컴포넌트 위치를 지정하겠다는 뜻
		
		btn01=new JButton("Button #01");
		p.add(btn01);
		
		btn02=new JButton("Button #02");
		p.add(btn02);
		
		btn03=new JButton("Button #03");
		p.add(btn03);
		
		
		btn01.setBounds(20,5,95,30);//x=20, y=5, 너비=95, 높이=30
		btn02.setBounds(55,45,105,70);
		btn03.setBounds(180,15,105,90);//패널위에 각 버튼의 절대 위치와 너비와 높이를 지정.
		
		add(p);//스윙 프레임 윈도우에 패널추가
		setVisible(true);
	}//생성자
}
public class SwingEx13 {

	public static void main(String[] args) {
		new MyFrame13();
	}

}
