package application.stage;

import javafx.stage.Stage;

public class SearchNextStage {
	private static SearchNextStage searchNextStage = new SearchNextStage();
	private static Stage stage;

	public static SearchNextStage getInstance() {
		return searchNextStage;
	}

	public static void setStage(Stage stage) {
		SearchNextStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
