package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class FormatMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 右端で折り返す
	 */
	@FXML
	public void onWrapText(Event e) {
		TextArea textArea = MainController.getTextArea();
		if (textArea.isWrapText()) {
			textArea.setWrapText(false);
		} else {
			textArea.setWrapText(true);
		}
	}

}
