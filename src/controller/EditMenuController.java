package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class EditMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 切り取り
	 */
	@FXML
	public void onCutText(Event e) {
		TextArea textArea = MainController.getTextArea();

		// クリップボードにコピー
		Clipboard clipboard = Clipboard.getSystemClipboard();
		ClipboardContent content = new ClipboardContent();
		content.putString(textArea.getSelectedText());
		clipboard.setContent(content);

		// 選択テキストを削除
		textArea.deleteText(textArea.getSelection());
	}

	/**
	 * コピー
	 */
	@FXML
	public void onCopyText(Event e) {
		TextArea textArea = MainController.getTextArea();
		Clipboard clipboard = Clipboard.getSystemClipboard();
		ClipboardContent content = new ClipboardContent();
		content.putString(textArea.getText());
		clipboard.setContent(content);
	}

	/**
	 * 貼り付け
	 */
	@FXML
	public void onPasteText(Event e) {
		TextArea textArea = MainController.getTextArea();
		Clipboard clipboard = Clipboard.getSystemClipboard();
		textArea.appendText(clipboard.getString());
	}

	/**
	 * 削除
	 */
	@FXML
	public void onDeleteText(Event e) {
		TextArea textArea = MainController.getTextArea();
		textArea.deleteText(textArea.getSelection());
	}
}
