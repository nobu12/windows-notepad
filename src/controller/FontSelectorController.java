package controller;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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

	private static final String[] STYLE_LIST = new String[] {"標準", "斜体", "太字", "太字 斜体"};
	private static final String[] SIZE_LIST = new String[] {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};

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
	    Font fonts[] = ge.getAllFonts();
	    List<String> fontList = new ArrayList<>();
	    for (Font f : fonts){
	    	fontList.add(f.getName());
	    }
	    String[] fontArray = new String[fontList.size()];
		fontNameList.setItems(FXCollections.observableArrayList(fontList.toArray(fontArray)));
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
