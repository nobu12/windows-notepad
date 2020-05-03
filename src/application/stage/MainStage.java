package application.stage;

import javafx.stage.Stage;

public class MainStage {
	private static MainStage mainStage = new MainStage();
	private static Stage stage;

	public static MainStage getInstance() {
		return mainStage;
	}

	public static void setStage(Stage stage) {
		MainStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
