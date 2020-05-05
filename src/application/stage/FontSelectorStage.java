package application.stage;

import javafx.stage.Stage;

public class FontSelectorStage {
	private static FontSelectorStage fontSelectorStage = new FontSelectorStage();
	private static Stage stage;

	public static FontSelectorStage getInstance() {
		return fontSelectorStage;
	}

	public static void setStage(Stage stage) {
		FontSelectorStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
