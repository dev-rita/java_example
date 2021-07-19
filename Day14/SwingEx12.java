import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame11 extends JFrame{//AWT Frame접두어에 J만 붙이면 스윙 프레임이 된다.
	public MyFrame11() {
		setSize(600,150);//프레임 폭과 높이>>폭 600, 높이 150으로 설정.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//스윙 프레임 윈도우 닫기. 범용성없음. 스윙프레임에서만 사용됨. 윈도우함수써도됨.
		setTitle("피자주문");//스윙 프레임 윈도우 제목 설정
		
		JPanel panel=new JPanel();//스윙패널로 각 컴포넌트를 그룹화 시켜 배치하는 컨테이너 레이아웃.
		JPanel panelA=new JPanel();
		JPanel panelB=new JPanel();
		
		JLabel label01=new JLabel("자바 피자에 오신 것을 환영. 피자의 종류 선택.");//스윙 라벨은 설명을 덧붙일때 사용한다.
		panelA.add(label01);//패널에 라벨 컴포넌트 추가
		
		JButton button01=new JButton("콤보피자");//스윙 버튼 추가
		JButton button02=new JButton("포테이토 피자");
		JButton button03=new JButton("불고기 피자");
		panelB.add(button01);
		panelB.add(button02);
		panelB.add(button03);
		
		JLabel label02=new JLabel("개수");
		JTextField field01=new JTextField(10);//스윙 텍스트 필드는 한 줄 입력박스를 만든다.
		panelB.add(label02);
		panelB.add(field01);
		
		panel.add(panelA);
		panel.add(panelB);
		add(panel);//스윙 프레임 윈도우에 패널추가
		setVisible(true);
	}
}
public class SwingEx12 {
	public static void main(String[] args) {
		new MyFrame11();
	}
}
