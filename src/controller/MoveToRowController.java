package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.MoveToLineStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MoveToRowController implements Initializable {

	@FXML
	private TextField rowNumber;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 移動
	 */
	@FXML
	public void onClickMoveToRowButton(Event e) {
		String rowNumber = this.rowNumber.getText();
		MoveToLineStage.getStage().close();
		TextArea textArea = MainController.getTextArea();
		// TextAreaクラスには特定の行番号にアクセスするメソッドがない
		// そのため、テキストエリアに入力されている文字数からpositionCaretメソッドを使って、指定された行番号の位置に移動する
		String inputText[] = textArea.getText().split("\n");
		int charCountSum = 0;
		for (int i = 0; i < Integer.valueOf(rowNumber) - 1; i++) {
			charCountSum += inputText[i].length();
		}
		// positionCaretメソッドは改行文字を含めた位置に移動するため、行番号分の加算が必要
		textArea.positionCaret(charCountSum + Integer.valueOf(rowNumber) - 1);
	}

	/**
	 * キャンセル
	 */
	@FXML
	public void onClickCancelButton(Event e) {
		MoveToLineStage.getStage().close();
	}

}
