import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

class MyPanel14 extends JPanel{
	BufferedImage img=null;//이미지를 읽어와서 버퍼링 즉 임시저장한다.
	int img_x=100;//이미지 x좌표
	int img_y=100;//이미지 y좌표
	
	public MyPanel14() {
		try {
			img=ImageIO.read(new File("./src/car.jpg"));
		}catch(IOException ie) {
			System.out.println("차그림이 없다.");
			System.exit(1);//인자값으로 0을 주면 문제가 없이 종료. 1로 주면 문제가 있어서 종류
		}//try~catch문은 실행시 예외처리를 하는 문이다.
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();//키 코드번호를 구함.
				//(0,0)(1,0)(2,0)(3,0)
				//(0,1)(1,1)(2,1)(3,1)
				//(0,2)(1,2)(2,2)(3,2) y가 위로가기 위해 -를 하는건 위로갈때 (x,y)로 봤을 때 줄어들기 때문이다.
				switch(keyCode) {
				case KeyEvent.VK_UP: img_y-=10; break;//위로 가는 방향키를 눌렀을 때 원점이 가운데가아닌 좌상단이여서
				case KeyEvent.VK_DOWN: img_y+=10; break;//아래로 가는 방향키를 눌렀을 때
				case KeyEvent.VK_LEFT: img_x-=10; break;//왼쪽으로 가는 방향키를 눌렀을 때
				case KeyEvent.VK_RIGHT: img_x+=10; break;//아래쪽으로 가는 방향키를 눌렀을 때
				}
				repaint();//다시 그림을 그리고자 그리는 메소드를 호출.
			}//키를 눌렀을 때 호출.
		});//키보드 이벤트 등록. 익명클래스.
		this.requestFocus();
		//this는 MyPanel14를 뜻함. 원래 패널은 키보드 포커스를 받을 수 없다. 그러므로 포커스를 요청하고
		setFocusable(true);//포커스를 받을 수 있게 한다.
	}//생성자

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//paintComponets(g)하면 잔상생김.
		g.drawImage(img, img_x, img_y, null);//차 그림을 x, y좌표에 관찰자 없이(null) 그린다.
	}//무엇을 그리고자 할 때 오버라이딩
	
}//MyPanel14 class
public class SwingCarGame14 extends JFrame {
	public SwingCarGame14() {
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel14());//스윙 프레임 윈도우 패널을 추가
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCarGame14();
	}
}
