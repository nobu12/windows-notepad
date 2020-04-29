package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.window.Window;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileMenuController implements Initializable {
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 何もしない
	}

	/**
	 * 新規
	 */
	@FXML
	public void onCreateNewFile(Event e) {
		Window.getStage().close();
		Main main = new Main();
		main.start(new Stage());
	}

	/**
	 * 開く
	 */
	@FXML
	public void onOpenNewFile() {
		FileChooser fc = new FileChooser();
		//        fc.setTitle("ファイル選択");
		//        fc.getExtensionFilters().addAll(
		//          new FileChooser.ExtensionFilter("すべてのファイル", "*.*")
		//        );
		// 初期フォルダをホームに
		//        fc.setInitialDirectory(new File(System.getProperty("user.home")));
		// ファイルダイアログ表示
		//File file = fc.showSaveDialog(null);
		fc.showOpenDialog(null);
	}

	/**
	 * 上書き保存
	 */
	@FXML
	public void onSaveOverWriteFile() {
		FileChooser fc = new FileChooser();
		fc.showSaveDialog(Window.getStage());
	}

	/**
	 * 名前を付けて保存
	 */
	@FXML
	public void onSaveNewFile() {
		FileChooser fc = new FileChooser();
		fc.showSaveDialog(Window.getStage());
	}

	/**
	 * ページ設定
	 */
	@FXML
	public void onPrintConfiguration() {
		PrinterJob job = PrinterJob.createPrinterJob();
		job.showPageSetupDialog(null);
	}

	/**
	 * ページ設定
	 */
	@FXML
	public void onPrintOut() {
        PrinterJob job = PrinterJob.createPrinterJob();
        job.showPrintDialog(null);
	}

	/**
	 * メモ帳の終了
	 */
	@FXML
	public void onCloseApplication() {
        Platform.exit();
	}
}
