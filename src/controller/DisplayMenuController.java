package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class DisplayMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * ステータスバー
	 */
	@FXML
	public void onShowStatusBar(Event e) {
		Label textField = MainController.getStatusBar();
		if (textField.getMaxHeight() == 0) {
			textField.setMaxHeight(-1);
			textField.setMinHeight(-1);
		} else {
			textField.setMaxHeight(0);
			textField.setMinHeight(0);
		}
	}

}
