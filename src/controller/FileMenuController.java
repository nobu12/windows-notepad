package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.stage.ConfirmSaveStage;
import application.stage.MainStage;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.PrinterJob;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
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
		TextArea textArea = MainController.getTextArea();
		if (!"".equals(textArea.getText())) {
			try {
				Pane root = (Pane) FXMLLoader.load(
						getClass().getResource("../application/ConfirmSave.fxml"));

				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setTitle("メモ帳");
				stage.setScene(scene);
				stage.setResizable(false);
				stage.initModality(Modality.APPLICATION_MODAL);
				ConfirmSaveStage.setStage(stage);
				stage.showAndWait();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
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
		fc.showSaveDialog(MainStage.getStage());
	}

	/**
	 * 名前を付けて保存
	 */
	@FXML
	public void onSaveNewFile() {
		FileChooser fc = new FileChooser();
		fc.showSaveDialog(MainStage.getStage());
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
	 * 印刷
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
