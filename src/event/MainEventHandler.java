package event;

import controller.MainController;
import controller.data.MainTextAreaData;
import javafx.scene.input.KeyCode;

public class MainEventHandler {

	/**
	 * 元に戻す用に、元データを保持しておくためのイベント
	 */
	public static void setTextAreaKeyEvent() {
		MainController.getTextArea()
				.setOnKeyPressed(keyEvent -> {
					if (KeyCode.BACK_SPACE.equals(keyEvent.getCode())) {
						MainTextAreaData.setPreviousString(MainController.getTextArea().getText());
					}
				});
	}

	/**
	 * テキストエリアが変更されたときのイベント
	 */
	public static void setTextAreaChangedEvent() {
		MainController.getTextArea().textProperty().addListener((observable, oldValue, newValue) -> {
			MainTextAreaData.setChanged();
		});
	}

}
