import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//자바 코드로 작성하는 프로그램적 레이아웃
interface F2{
	static final int x=150;
}

public class Fx_02 extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		VBox root=new VBox();//컴포넌트를 수직으로 배치하는 레이아웃 객체 생성.
		root.setPrefWidth(380);//VBox 폭
		root.setPrefHeight(F2.x);//VBox 높이
		root.setAlignment(Pos.CENTER);//컨트롤 중앙정렬 Pos.CENTER>> 인터페이스 static final 상수
		root.setSpacing(20);//컨트롤 수직간격
		
		Label label=new Label();//라벨은 설명을 덧붙일 때 사용.
		label.setText("Hello. JAVA FX");
		label.setFont(new Font(50));//글자크기
		
		Button button=new Button();
		button.setText("확인");//버튼 위의 캡션 문자열 설정
		button.setOnAction(event -> Platform.exit());//버튼 이벤트를 람다식으로 처리. 
		//event가 매개변수로 들어가 Platform.exit()를 실행함. 확인 버튼 클릭하면 윈도우창 종료.
		
		root.getChildren().add(label);//레이아웃 자식노드 라벨 추가
		root.getChildren().add(button);//레이아웃 자식노드 버튼 추가
		
		Scene scene=new Scene(root);//레이아웃을 장면에 설정하는 객체 생성
		
		stage.setTitle("프로그램적 FX연습");//FX 윈도우 제목 설정
		stage.setScene(scene);//무대에 장면을 올림.
		stage.show();//윈도우 보여주기.
	}

	public static void main(String[] args) {
		launch(args); //start()메소드 호출.
	}
}
