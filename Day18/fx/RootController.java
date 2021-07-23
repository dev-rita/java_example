package fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {
	@FXML private Button btn1;//xml에서 지정한 fx:id값과 일치해야한다.
	@FXML private Button btn2;
	@FXML private Button btn3;
	
	@Override
	public void initialize(URL location, ResourceBundle res) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action();
			}//첫 번째 버튼 클릭할 때 호출.
		
		});//익명클래스 문법으로 첫 번째 버튼 이벤트 처리 >> 외부클래스$번호.class(Rootcontroller$1.class로 컴파일)
		btn3.setOnAction(event -> handleBtn3Action());//람다식으로 이벤트 처리. 익명클래스도 람다식으로 처리된다.
	}

	public void handleBtn1Action() {
		System.out.println("버튼 1 클릭");
	}//첫 번째 버튼 이벤트 처리
	
	public void handleBtn2Action() {
		System.out.println("버튼 2 클릭");
	}//두 번째 버튼 이벤트 처리. xml에서 이벤트 등록해줬기 때문에 다로 코드작성 안해도 된다.
	
	public void handleBtn3Action() {
		System.out.println("버튼 3 클릭");
	}//첫 번째 버튼 이벤트 처리
}
