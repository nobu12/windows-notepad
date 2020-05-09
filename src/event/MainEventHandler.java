package event;

import controller.EditMenuController;
import controller.MainController;
import controller.data.MainTextAreaData;
import javafx.scene.control.TextArea;
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

			MainController.getStatusBar().setText(getStatusBarText());
		});
	}

	/**
	 * テキストエリア上でマウスがクリックされたときのイベント
	 */
	public static void setTextAreaMouseClickedEvent() {
			MainController.getTextArea().setOnMouseClicked(value -> {
				MainController.getStatusBar().setText(getStatusBarText());
			});
	}

	/**
	 * テキストエリア上でキーボードのキーが離されたときのイベント
	 */
	public static void setTextAreaKeyReleasedEvent() {
			MainController.getTextArea().setOnKeyReleased(value -> {
				MainController.getStatusBar().setText(getStatusBarText());
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

	/**
	 * ステータスバーに表示するテキストを取得する
	 * @return
	 */
	private static String getStatusBarText() {
		TextArea textArea = MainController.getTextArea();
		StringBuilder sb = new StringBuilder();

		int selectionEnd = textArea.getSelection().getEnd();
		// テキストエリアの末尾以外が選択されているとき
		if (textArea.getText().length() != selectionEnd) {
			selectionEnd++;
		}

		sb.append(textArea.getText(0, selectionEnd).split("\n").length).append("行、");

		int sum = 0;
		for (int i = 0; i < textArea.getText(0, selectionEnd ).split("\n").length - 1; i++) {
			sum += textArea.getText(0, selectionEnd).split("\n")[i].length() + 1;
		}

		sb.append(textArea.getText().length() != selectionEnd ? selectionEnd - sum : selectionEnd - sum + 1).append("列");
		return sb.toString();
	}

}
