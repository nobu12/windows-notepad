package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.SearchStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SearchController implements Initializable {

	@FXML
	private TextField searchText;

	@FXML
	private CheckBox caseSensitive;

	@FXML
	private ToggleGroup searchMethodGroup;
	@FXML
	private RadioButton upSearch;
	@FXML
	private RadioButton downSearch;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 検索
	 */
	@FXML
	public void onClickSearchButton(Event e) {
		TextArea textArea = MainController.getTextArea();
		int anchor = textArea.getAnchor() + 1;
		if (textArea.getSelectedText().indexOf(searchText.getText()) == -1) {
			anchor = textArea.getAnchor();
		}

		int start = 0;
		if (caseSensitive.isSelected()) {
			start = textArea.getText().indexOf(searchText.getText(), anchor);
		} else {
			start = textArea.getText().toLowerCase().indexOf(searchText.getText().toLowerCase(), anchor);
		}
		if (upSearch == searchMethodGroup.getSelectedToggle()) {
			anchor = textArea.getAnchor() - 1;
			if (caseSensitive.isSelected()) {
				start = textArea.getText().lastIndexOf(searchText.getText(), anchor);
			} else {
				start = textArea.getText().toLowerCase().lastIndexOf(searchText.getText().toLowerCase(), anchor);
			}
		}

		int end = start + searchText.getText().length();
		textArea.selectRange(start, end);
	}

	/**
	 * キャンセル
	 */
	@FXML
	public void onClickCancelButton(Event e) {
		SearchStage.getStage().close();
	}

}
