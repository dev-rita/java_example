import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx05 extends Frame{
	Panel pan01, pan02, pan03;
	//Panel은 컨테이너 즉 레이아웃이다. 그림 객체 각 컴포넌트를 묶어 그룹화 시켜 이 패널을 기준으로 프레임 윈도우에 배치한다.

	public FrameEx05() {
		pan01=new Panel();
		pan02=new Panel();
		pan03=new Panel();

		pan01.setBackground(Color.GREEN);//패널 배경색을 설정.
		pan02.setBackground(Color.BLUE);
		pan03.setBackground(Color.ORANGE);

		add(BorderLayout.NORTH,pan01);//첫 번째 패널을 프레임 북쪽에 보더레이아웃 배치.
		add(BorderLayout.CENTER,pan02);//두 번째 패널을 프레임 중앙에 보더레이아웃 배치.
		add(BorderLayout.SOUTH,pan03);//세 번째 패널을 프레임 남쪽에 보더레이아웃 배치.

		pan01.add(new Button("Button 01"));//첫 번째 패널에 버튼 추가.
		pan01.add(new Button("Button 02"));
		pan02.add(new Button("Button 03"));
		pan03.add(new Button("Button 04"));
		pan03.add(new Button("Button 05"));

		setSize(200,300);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});//익명클래스 즉 내부 무명클래스>>외부클래스$번호.class(FrameEx05$1.class)
	}//생성자
}
public class PannelEx05 {

	public static void main(String[] args) {
		new FrameEx05();
	}

}
