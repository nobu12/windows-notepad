package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.SearchStage;
import controller.data.SearchData;
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
		String target = "";
		// 次を検索から本メソッドが呼ばれた場合
		if (searchText == null) {
			target = SearchData.getSearchString();
		} else {
			target = searchText.getText();
			SearchData.setSearchString(target);
		}

		int anchor = textArea.getAnchor() + 1;
		if (textArea.getSelectedText().indexOf(target) == -1) {
			anchor = textArea.getAnchor();
		}

		int start = 0;
		if (caseSensitive != null && caseSensitive.isSelected()) {
			start = textArea.getText().indexOf(target, anchor);
		} else {
			start = textArea.getText().toLowerCase().indexOf(target.toLowerCase(), anchor);
		}
		if (upSearch != null && upSearch == searchMethodGroup.getSelectedToggle()) {
			anchor = textArea.getAnchor() - 1;
			if (caseSensitive.isSelected()) {
				start = textArea.getText().lastIndexOf(target, anchor);
			} else {
				start = textArea.getText().toLowerCase().lastIndexOf(target.toLowerCase(), anchor);
			}
		}

		int end = start + target.length();
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
