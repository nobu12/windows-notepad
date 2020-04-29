package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

public class FileMenuController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // 何もしない
    }

    @FXML
    public void onCreateNewFile() {
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
}
