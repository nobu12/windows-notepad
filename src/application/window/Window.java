package application.window;

import javafx.stage.Stage;

public class Window {
	private static Window window = new Window();
	private static Stage stage;

	public static Window getInstance() {
		return window;
	}

	public static void setStage(Stage stage) {
		Window.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
