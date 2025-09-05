package application;

import javafx.application.*;
import javafx.stage.Stage;


public class BusMain extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Bus theModel = new Bus();
		AbstractBusView theView1 = new BusJavaFX(primaryStage);
		BusController controller1 = new BusController(theModel, theView1);
		
		AbstractBusView theView2 = new BusJavaFX2(new Stage());
		BusController controller2 = new BusController(theModel, theView2);
	}

}
