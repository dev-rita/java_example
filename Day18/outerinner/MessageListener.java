package outerinner;

import outerinner.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다."); 
	}

}
