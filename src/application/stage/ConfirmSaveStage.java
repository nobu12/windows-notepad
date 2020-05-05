package application.stage;

import javafx.stage.Stage;

public class ConfirmSaveStage {
	private static ConfirmSaveStage confirmSaveStage = new ConfirmSaveStage();
	private static Stage stage;

	public static ConfirmSaveStage getInstance() {
		return confirmSaveStage;
	}

	public static void setStage(Stage stage) {
		ConfirmSaveStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
