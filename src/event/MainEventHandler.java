package event;

import controller.EditMenuController;
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
						EditMenuController.getEmc().getUndo().setDisable(false);
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

	/**
	 * テキストエリアのテキストが選択/選択解除されたときのイベント
	 */
	public static void setTextAreaSelectedEvent() {
		MainController.getTextArea().selectionProperty()
				.addListener((observable, oldValue, newValue) -> {
					if ("".equals(MainController.getTextArea().getSelectedText())) {
						setTextAreaDisable(true);
					} else {
						setTextAreaDisable(false);
					}
				});
	}

	/**
	 * メニューの活性・非活性の設定をまとめて実行
	 * @param value 活性はfalse、非活性はtrue
	 */
	private static void setTextAreaDisable(boolean value) {
		EditMenuController.getEmc().getCut().setDisable(value);
		EditMenuController.getEmc().getCopy().setDisable(value);
		EditMenuController.getEmc().getDelete().setDisable(value);
	}

}
