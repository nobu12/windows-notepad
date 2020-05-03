package application.stage;

import javafx.stage.Stage;

public class FaqStage {
	private static FaqStage faqStage = new FaqStage();
	private static Stage stage;

	public static FaqStage getInstance() {
		return faqStage;
	}

	public static void setStage(Stage stage) {
		FaqStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
