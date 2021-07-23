package outerinner;

public class Button {
	//내부 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}//Ui개발 시 이벤트 처리 목적으로 많이 사용.
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener=listener;//실제 가리키는 객체는 자기 객체
	}
	
	void touch() {
		listener.onClick();
	}
	
	
}
