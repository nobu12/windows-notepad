package application.stage;

import javafx.stage.Stage;

public class ReplacementStage {
	private static ReplacementStage replacementStage = new ReplacementStage();
	private static Stage stage;

	public static ReplacementStage getInstance() {
		return replacementStage;
	}

	public static void setStage(Stage stage) {
		ReplacementStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
