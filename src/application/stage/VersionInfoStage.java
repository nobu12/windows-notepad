package application.stage;

import javafx.stage.Stage;

public class VersionInfoStage {
	private static VersionInfoStage versionInfoStage = new VersionInfoStage();
	private static Stage stage;

	public static VersionInfoStage getInstance() {
		return versionInfoStage;
	}

	public static void setStage(Stage stage) {
		VersionInfoStage.stage = stage;
	}

	public static Stage getStage() {
		return stage;
	}
}
