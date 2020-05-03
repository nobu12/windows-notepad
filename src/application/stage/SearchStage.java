package application.stage;

import javafx.stage.Stage;

public class SearchStage {
	private static SearchStage searchStage = new SearchStage();
	private static Stage stage;

	public static SearchStage getInstance() {
		return searchStage;
	}

	public static void setStage(Stage stage) {
		SearchStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
