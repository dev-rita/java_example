package outerinner;

public class ButtonExample {

	public static void main(String[] args) {
		Button btn=new Button();
		btn.setOnClickListener(new CallListener());//업캐스팅 되면서 매개변수 다형성 적용
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
	}

}
