package application.stage;

import javafx.stage.Stage;

public class MoveToLineStage {
	private static MoveToLineStage moveToLineStage = new MoveToLineStage();
	private static Stage stage;

	public static MoveToLineStage getInstance() {
		return moveToLineStage;
	}

	public static void setStage(Stage stage) {
		MoveToLineStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
