package controller;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import application.stage.MoveToLineStage;
import application.stage.SearchStage;
import controller.data.SearchData;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class EditMenuController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 切り取り
	 */
	@FXML
	public void onCutText(Event e) {
		TextArea textArea = MainController.getTextArea();

		// クリップボードにコピー
		Clipboard clipboard = Clipboard.getSystemClipboard();
		ClipboardContent content = new ClipboardContent();
		content.putString(textArea.getSelectedText());
		clipboard.setContent(content);

		// 選択テキストを削除
		textArea.deleteText(textArea.getSelection());
	}

	/**
	 * コピー
	 */
	@FXML
	public void onCopyText(Event e) {
		TextArea textArea = MainController.getTextArea();
		Clipboard clipboard = Clipboard.getSystemClipboard();
		ClipboardContent content = new ClipboardContent();
		content.putString(textArea.getText());
		clipboard.setContent(content);
	}

	/**
	 * 貼り付け
	 */
	@FXML
	public void onPasteText(Event e) {
		TextArea textArea = MainController.getTextArea();
		Clipboard clipboard = Clipboard.getSystemClipboard();
		textArea.appendText(clipboard.getString());
	}

	/**
	 * 削除
	 */
	@FXML
	public void onDeleteText(Event e) {
		TextArea textArea = MainController.getTextArea();
		textArea.deleteText(textArea.getSelection());
	}

	/**
	 * 検索
	 */
	@FXML
	public void onOpenSearch(Event e) {
		try {
			Pane root = (Pane) FXMLLoader.load(
					getClass().getResource("../application/Search.fxml"));

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("検索");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
			SearchStage.setStage(stage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * 次を検索
	 */
	@FXML
	public void onSearchNext(Event e) {
		if ("".equals(SearchData.getSearchString())) {
			onOpenSearch(e);
		} else {
			SearchController sc = new SearchController();
			sc.onClickSearchButton(e);
		}
	}


	/**
	 * 行へ移動
	 */
	@FXML
	public void onMoveToLine(Event e) {
		try {
			Pane root = (Pane) FXMLLoader.load(
					getClass().getResource("../application/MoveToRow.fxml"));

			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setTitle("行へ移動");
			stage.setScene(scene);
			stage.show();
			MoveToLineStage.setStage(stage);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * すべて選択
	 */
	@FXML
	public void onSelectAllText(Event e) {
		TextArea textArea = MainController.getTextArea();
		textArea.selectAll();
	}

	/**
	 * 日付と時刻
	 */
	@FXML
	public void onInsertDateTime(Event e) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
		LocalDateTime localDateTime = LocalDateTime.now();

		TextArea textArea = MainController.getTextArea();
		textArea.appendText(localDateTime.format(dateTimeFormatter));
	}
}
