package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;

public class FaqController implements Initializable {

	@FXML
    private VBox horizontalScrollAnswer;
	@FXML
    private Hyperlink fontStyleAndSize;

    private static FaqController editMenuController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		editMenuController = this;
	}

	public static FaqController getEmc() {
		return editMenuController;
	}

	/**
	 * 元に戻す
	 */
	@FXML
	public void onClickHorizontalScrollLink(Event e) {
		horizontalScrollAnswer.setVisible(true);
		fontStyleAndSize.setTranslateY(0);
	}

	@FXML
	public void onClickFontStyleAndSizeLink(Event e) {
	}

	@FXML
	public void onClickTextEditLink(Event e) {
	}

	@FXML
	public void onClickSaveFileExtendedLink(Event e) {
	}

	@FXML
	public void onClickPrintDocmentLink(Event e) {
	}

	@FXML
	public void onClickInsertTimeAndDateLink(Event e) {
	}

	@FXML
	public void onClickReplacementWordLink(Event e) {
	}

	@FXML
	public void onClickCreateHeaderAndFotterLink(Event e) {
	}

	@FXML
	public void onClickMoveSpecificLineLink(Event e) {
	}

}
