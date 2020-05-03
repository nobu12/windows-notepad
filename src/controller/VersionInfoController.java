package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.MainStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class VersionInfoController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * OKボタン
	 */
	@FXML
	public void onClickOkButton(Event e) {
		MainStage.getStage().close();
	}
}
