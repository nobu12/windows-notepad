package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.FontSelectorStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

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

	/**
	 * フォント
	 */
	@FXML
	public void onOpenFontSelector(Event e) {
		try {
			Pane root = (Pane ) FXMLLoader.load(
					getClass().getResource("../application/FontSelector.fxml"));

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("フォント");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.show();
			FontSelectorStage.setStage(stage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
