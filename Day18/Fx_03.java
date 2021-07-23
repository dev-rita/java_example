import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Fx_03 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("root03.xml"));//xml파일을 불러옴.
		Scene scene=new Scene(root);//레이아웃을 장면에 올림.
		
		stage.setTitle("Fxml 레이아웃");//무대 윈도우 제목 설정
		stage.setScene(scene);//무대위에 장면 설정
		stage.show();//윈도우 표시
	}

	public static void main(String[] args) {
		launch(args);
	}
}
