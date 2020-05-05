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

public class FontSelectorController implements Initializable {

	@FXML
	private ListView<String> fontNameList;

	@FXML
	private ListView<String> styleList;

	@FXML
	private ListView<String> sizeList;

	private static final String[] STYLE_LIST = new String[] {"標準", "斜体", "太字", "太字 斜体"};
	private static final String[] SIZE_LIST = new String[] {"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setFontNameList();
		setStyleList();
		setSizeList();
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
		styleList.setItems(FXCollections.observableArrayList(STYLE_LIST));
	}

	/**
	 * サイズ一覧作成
	 */
	private void setSizeList() {
		sizeList.setItems(FXCollections.observableArrayList(SIZE_LIST));
	}

}
