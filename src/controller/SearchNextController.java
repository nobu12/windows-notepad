package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.SearchNextStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SearchNextController implements Initializable {

	@FXML
	private TextField searchText;

	@FXML
	private CheckBox caseSensitive;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 検索
	 */
	@FXML
	public void onClickSearchNextButton(Event e) {
		TextArea textArea = MainController.getTextArea();
		int anchor = textArea.getAnchor() + 1;
		if (textArea.getSelectedText().indexOf(searchText.getText()) == -1) {
			anchor = textArea.getAnchor();
		}
		int start = textArea.getText().indexOf(searchText.getText(), anchor);
		int end = start + searchText.getText().length();
		textArea.selectRange(start, end);
	}

	/**
	 * キャンセル
	 */
	@FXML
	public void onClickCancelButton(Event e) {
		SearchNextStage.getStage().close();
	}

}