package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.FaqStage;
import application.stage.VersionInfoStage;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelpMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * ヘルプの表示
	 */
	@FXML
	public void onOpenHelp(Event e) {
		try {
			ScrollPane root = (ScrollPane) FXMLLoader.load(
					getClass().getResource("../application/Faq.fxml"));

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("Windowsヘルプとサポート");
			stage.setScene(scene);
			stage.show();
			FaqStage.setStage(stage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * バージョン情報
	 */
	@FXML
	public void onOpenVersionInfo(Event e) {
		try {
			Pane root = (Pane) FXMLLoader.load(
					getClass().getResource("../application/VersionInfo.fxml"));

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("メモ帳 のバージョン情報");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.initModality(Modality.APPLICATION_MODAL);
			VersionInfoStage.setStage(stage);
			stage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
