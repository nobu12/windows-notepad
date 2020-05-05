package event;

import controller.MainController;
import controller.data.MainTextAreaData;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MainEventHandler {

	/**
	 * 元に戻す用に、元データを保持しておくためのイベント
	 */
	public static void setTextAreaKeyEvent() {
		MainController.getTextArea()
				.setOnKeyPressed(new EventHandler<KeyEvent>() {
					@Override
					public void handle(KeyEvent ke) {
						if (KeyCode.BACK_SPACE.equals(ke.getCode())) {
							MainTextAreaData.setPreviousString(MainController.getTextArea().getText());
						}
					}
				});
	}

}
