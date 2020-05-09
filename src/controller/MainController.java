package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.MainStage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class MainController implements Initializable {

    @FXML
    private TextArea textArea;
    @FXML
    private Label statusBar;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * テキストエリアのオブジェクトを返す
	 * 本クラスで定義されているtextAreaクラス変数を返すと
	 * ヌルポになるためid名から取得するようにした
	 * @return テキストエリアのオブジェクト
	 */
	public static TextArea getTextArea() {
		return (TextArea) MainStage.getStage().getScene().lookup("#textArea");
	}

	public static Label getStatusBar() {
		return (Label) MainStage.getStage().getScene().lookup("#statusBar");
	}
}
