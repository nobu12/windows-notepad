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
	@FXML
	private VBox fontStyleAndSizeAnswer;
	@FXML
	private Hyperlink textEdit;
	@FXML
	private VBox textEditAnswer;
	@FXML
	private Hyperlink saveFileExtended;
	@FXML
	private VBox saveFileExtendedAnswer;
	@FXML
	private Hyperlink printDocment;
	@FXML
	private VBox printDocmentAnswer;
	@FXML
	private Hyperlink insertTimeAndDate;
	@FXML
	private VBox insertTimeAndDateAnswer;
	@FXML
	private Hyperlink replacementWord;
	@FXML
	private VBox replacementWordAnswer;
	@FXML
	private Hyperlink createHeaderAndFotter;
	@FXML
	private VBox createHeaderAndFotterAnswer;
	@FXML
	private Hyperlink moveSpecificLine;
	@FXML
	private VBox moveSpecificLineAnswer;

    private static FaqController editMenuController;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		editMenuController = this;
	}

	public static FaqController getEmc() {
		return editMenuController;
	}

	/**
	 * 「水平方向にスクロールせずにすべての文字列を表示」リンク押下
	 */
	@FXML
	public void onClickHorizontalScrollLink(Event e) {
		horizontalScrollAnswer.setVisible(true);
		fontStyleAndSize.setTranslateY(0);
		textEdit.setTranslateY(textEdit.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		saveFileExtended.setTranslateY(saveFileExtended.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		printDocment.setTranslateY(printDocment.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		insertTimeAndDate.setTranslateY(insertTimeAndDate.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		replacementWord.setTranslateY(replacementWord.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		createHeaderAndFotter.setTranslateY(createHeaderAndFotter.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
		moveSpecificLine.setTranslateY(moveSpecificLine.getTranslateY() + horizontalScrollAnswer.getPrefHeight());
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
