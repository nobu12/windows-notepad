package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.ReplacementStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
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
