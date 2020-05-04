package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.ReplacementStage;
import controller.data.SearchData;
import controller.util.SearchUtil;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ReplacementController implements Initializable {

	@FXML
	private TextField searchText;

	@FXML
	private CheckBox caseSensitive;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 次を検索
	 */
	@FXML
	public void onClickSearchNextButton(Event e) {
		TextArea textArea = MainController.getTextArea();
		String target = "";
		// 次を検索から本メソッドが呼ばれた場合
		if (searchText == null) {
			target = SearchData.getSearchString();
		} else {
			target = searchText.getText();
			SearchData.setSearchString(target);
		}

		int start = SearchUtil.getStartIndex(searchText, caseSensitive, null, null);
		int end = start + target.length();
		textArea.selectRange(start, end);
	}

	/**
	 * 置換して次に
	 */
	@FXML
	public void onClickReplaceNextButton(Event e) {

	}

	/**
	 * すべて置換
	 */
	@FXML
	public void onClickReplaceAllButton(Event e) {

	}

	/**
	 * キャンセル
	 */
	@FXML
	public void onClickCancelButton(Event e) {
		ReplacementStage.getStage().close();
	}

}
