import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel15 extends JPanel{
	BufferedImage img=null;
	int img_x=0, img_y=0;
	
	public MyPanel15() {
		try {
			img=ImageIO.read(new File("./src/car.jpg"));
		}catch(IOException ie) {
			System.out.println("차 그림이 없다.");
			System.exit(1);
		}
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				img_x=e.getX();//마우스를 누른 X좌표값
				img_y=e.getY();//마우스를 누른 Y좌표값
				repaint();//다시 그림을 그리고자 그리는 메소드를 호출.
			}//마우스를 아래로 눌렀을때 호출.
		});//마우스 이벤트 등록 > 익명클래스 문법(외부클래스$번호.class)
	}//생성자

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y,null);
	}
}

public class SwingEx15 extends JFrame{
	public SwingEx15() {
		add(new MyPanel15());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setVisible(true);
	}
	public static void main(String[] args) {	
		new SwingEx15();
	}

}
