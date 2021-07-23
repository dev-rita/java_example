import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx_06 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root=(Parent)FXMLLoader.load(getClass().getResource("root04.xml"));
		//(Parent)없어도 자동 형변환됨.
		Scene scene=new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		//장면에 css 적용
		
		stage.setTitle("외부 스타일 css 적용");
		stage.setScene(scene);//무대에 장면 설정
		stage.show();//윈도우 보여주기
	}

	public static void main(String[] args) {
		launch(args);
	}

}
