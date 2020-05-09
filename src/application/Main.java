package application;

import application.stage.MainStage;
import event.MainEventHandler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(
					getClass().getResource(getClass().getSimpleName() + ".fxml"));

			Scene scene = new Scene(root);
			//            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("メモ帳");
			primaryStage.setScene(scene);
			primaryStage.show();
			MainStage.setStage(primaryStage);
			MainEventHandler.setTextAreaKeyEvent();
			MainEventHandler.setTextAreaChangedEvent();
			MainEventHandler.setTextAreaSelectedEvent();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
