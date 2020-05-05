package controller;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.stage.FontSelectorStage;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FontSelectorController implements Initializable {

	@FXML
	private TextField fontName;
	@FXML
	private ListView<String> fontNameList;

	@FXML
	private TextField fontStyleName;
	@FXML
	private ListView<String> fontStyleNameList;

	@FXML
	private TextField fontSize;
	@FXML
	private ListView<String> fontSizeList;

	private static final String STYLE_PLAIN = "標準";
	private static final String STYLE_ITALIC = "斜体";
	private static final String STYLE_BOLD = "太字";
	private static final String STYLE_BOLD_ITALIC = "太字 斜体";
	private static final String[] STYLE_LIST = new String[] { FontSelectorController.STYLE_PLAIN,
			FontSelectorController.STYLE_ITALIC, FontSelectorController.STYLE_BOLD,
			FontSelectorController.STYLE_BOLD_ITALIC };

	private static final String[] SIZE_LIST = new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22",
			"24", "26", "28", "36", "48", "72" };

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 一覧セット
		setFontNameList();
		setStyleList();
		setSizeList();

		// イベントセット テキストフィールド
		setFontNameChangeEvent();
		setFontStyleNameChangeEvent();
		setFontSizeChangeEvent();
		// イベントセット リストビュー
		setFontNameListChangeEvent();
		setFontStyleNameListChangeEvent();
		setFontSizeListChangeEvent();
	}

	/**
	 * フォント一覧作成
	 */
	private void setFontNameList() {
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    Font fontArray[] = ge.getAllFonts();
	    List<String> fontList = new ArrayList<>();
	    for (Font font : fontArray){
	    	fontList.add(font.getName());
	    }
		fontNameList.setItems(FXCollections.observableArrayList(fontList.toArray(new String[fontList.size()])));
	}

	/**
	 * スタイル一覧作成
	 */
	private void setStyleList() {
		fontStyleNameList.setItems(FXCollections.observableArrayList(STYLE_LIST));
	}

	/**
	 * サイズ一覧作成
	 */
	private void setSizeList() {
		fontSizeList.setItems(FXCollections.observableArrayList(SIZE_LIST));
	}

	/**
	 * OKボタン
	 */
	@FXML
	public void onClickOkButton(Event e) {
		TextArea textArea = MainController.getTextArea();
		javafx.scene.text.Font font = javafx.scene.text.Font.font(fontName.getText(),
				STYLE_BOLD.equals(fontStyleName.getText()) || STYLE_BOLD_ITALIC.equals(fontStyleName.getText())
						? FontWeight.BOLD
						: FontWeight.NORMAL,
				STYLE_ITALIC.equals(fontSize)
						? FontPosture.ITALIC
						: FontPosture.REGULAR,
				Integer.valueOf(fontSize.getText()));
		textArea.setFont(font);
		FontSelectorStage.getStage().close();
	}

	/**
	 * キャンセルボタン
	 */
	@FXML
	public void onClickCancelButton(Event e) {
		FontSelectorStage.getStage().close();
	}

	/**
	 * テキストフィールドのフォント入力時に、フォント一覧へ反映する
	 */
	private void setFontNameChangeEvent() {
		fontName.textProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontNameList.getSelectionModel().select(fontName.getText());
					fontNameList.scrollTo(fontName.getText());
				});
	}

	/**
	 * テキストフィールドのスタイル入力時に、スタイル一覧へ反映する
	 */
	private void setFontStyleNameChangeEvent() {
		fontStyleName.textProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontStyleNameList.getSelectionModel().select(fontStyleName.getText());
					fontStyleNameList.scrollTo(fontStyleName.getText());
				});
	}

	/**
	 * テキストフィールドのサイズ入力時に、サイズ一覧へ反映する
	 */
	private void setFontSizeChangeEvent() {
		fontSize.textProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontSizeList.getSelectionModel().select(fontSize.getText());
					fontSizeList.scrollTo(fontSize.getText());
				});
	}

	/**
	 * フォント一覧のフォント選択時に、テキストフィールドへ反映する
	 */
	private void setFontNameListChangeEvent() {
		fontNameList.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontName.setText(fontNameList.getSelectionModel().getSelectedItem());
				});
	}

	/**
	 * スタイル一覧のスタイル選択時に、テキストフィールドへ反映する
	 */
	private void setFontStyleNameListChangeEvent() {
		fontStyleNameList.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontStyleName.setText(fontStyleNameList.getSelectionModel().getSelectedItem());
				});
	}

	/**
	 * サイズ一覧のサイズ選択時に、テキストフィールドへ反映する
	 */
	private void setFontSizeListChangeEvent() {
		fontSizeList.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> {
					fontSize.setText(fontSizeList.getSelectionModel().getSelectedItem());
				});
	}

}
