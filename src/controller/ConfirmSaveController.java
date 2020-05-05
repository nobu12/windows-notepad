package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.ConfirmSaveStage;
import application.stage.MainStage;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

public class ConfirmSaveController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 保存する
	 */
	@FXML
	public void onClickSaveButton(Event e) {
		FileChooser fc = new FileChooser();
		fc.showSaveDialog(MainStage.getStage());
	}

	/**
	 * 保存しない
	 */
	@FXML
	public void onClickDoNotSaveButton(Event e) {
		ConfirmSaveStage.getStage().close();
		Platform.exit();
	}

	/**
	 * キャンセル
	 */
	@FXML
	public void onClickCancel(Event e) {
		ConfirmSaveStage.getStage().close();
	}

}
