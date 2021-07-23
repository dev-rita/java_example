import javafx.application.Application;
import javafx.stage.Stage;

public class Fx_01 extends Application {
	//Application을 상속해 UI를 나타냄. 
	//추상클래스이며, start()메소드가 포함되어 있어 반드시 구현해야 한다.

	@Override
	public void start(Stage stage) throws Exception {//FX에서는 stage로 윈도우를 구축.
	//start()메소드를 오버라이딩. stage는 무대를 뜻함. 최상위 컨테이너.
	//start()메소드는 응용프로그램이 시작할 때의 처리를 만들기 위한 것.
	//응용 프로그램을 시작하면 처음에 표시되는 응용프로그램의 윈도우로 Stage인스턴스가 start에 전달.
		stage.show();//무대에 Fx윈도우 창 보여줌. 
	}
	
	public static void main(String[] args) {
		launch(args); //Application에 포함된 static 메소드.
		//메인 메소드의 매개변수를 인자값으로 넣어 FX응용 프로그램을 시작.
		//start() 메소드 호출.
	}
}
