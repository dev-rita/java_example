import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingEx14 extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;//버튼 배열 변수 선언
	private String[] labels= {
			"Backspace","","","CE","c",
			"7","8","9","/","sqrt",
			"4","5","6","X","%",
			"1","2","3","-","1/x",
			"+/-","0",".","+","=",
	};//버튼위에 출력되는 배열원소값 초기화
	
	public SwingEx14() {
		tField=new JTextField(35);
		panel=new JPanel();
		tField.setText("0.");//텍스트 필드 초기값 설정
		tField.setEnabled(false);//텍스트 필드 비활성화
		
		panel.setLayout(new GridLayout(0,5,3,3));//패널에 그리드 레이아웃 설정, 5개의 열과 필요한 만큼의 행을 가진다(0).
		//격자간격 수평 좌우간격이 3, 두 번째 3은 수직 상하간격.
		buttons=new JButton[25];
		int index=0;//배열주소 번호
		
		for(int row=0;row<5;row++) {
			for(int col=0;col<5;col++) {
				buttons[index]=new JButton(labels[index]);//버튼 위에 25개의 캡션 문자열 지정.
				
				if(col>=3){//4 번째 열, 5 번째 열일 때 실행.
					buttons[index].setForeground(Color.red);//버튼위 글자색을 빨강으로 설정.
				}else {//1, 2, 3번 째 열의 버튼 위 글자색을 파랑으로 설정
					buttons[index].setForeground(Color.blue);
				}
				buttons[index].setBackground(Color.yellow);//25개 버튼 배경색을 노랑으로 설정
				panel.add(buttons[index]);//패널에 25개 버튼 추가
				index++;
			}//inner for
		}//outer for
		add(tField,BorderLayout.NORTH);//텍스트 필드를 프레임 북쪽에 배치
		add(panel,BorderLayout.CENTER);//패널을 프레임 중앙에 배치
		setVisible(true);
		pack();//프레임에 소속된 각 컴포넌트들의 크기에 맞게 조절
	}
	public static void main(String[] args) {
		new SwingEx14();
	}
}
