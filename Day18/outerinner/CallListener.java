package outerinner;

import outerinner.Button.OnClickListener;

public class CallListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("전화를 건다."); 
	}

}
