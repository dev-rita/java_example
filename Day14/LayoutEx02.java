import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class FrameEx02 extends Frame{//Frame클래스를 상속받아서 AWT 프레임 윈도우 창을 만든다.
	public FrameEx02() {
		setLayout(new FlowLayout());
		//배치관리자 설정. 배치관리자는 프레임윈도우나 컨테이너 즉 레이아웃 안에 그림 객체 즉 컴포넌트를 어떻게 배치할 것인지를 지정한다.
		//레이아웃은 각 그림 객체를 위에서 아래로, 왼쪽에서 오른쪽으로 물흐르듯 배치한다. 고정된 위치가 아닌 프레임에 따라 위치가 변한다.
		
		add(new Button("Button 01"));//첫 번째 버튼 배치
		add(new Button("Button 02"));//두 번째 버튼 배치
		add(new Button("Button 03"));//세 번째 버튼 배치
		add(new Button("Button 04"));
		add(new Button("Button 05"));	
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();//자원해제하면서 닫기
				//System.exit(0);//프로그램 종료. 생략해도 됨.
			}//현재 프레임 윈도우 닫기 했을 때 호출.			
		});
	}//생성자
}
public class LayoutEx02 {
	public static void main(String[] args) {
		new FrameEx02();
	}
}
