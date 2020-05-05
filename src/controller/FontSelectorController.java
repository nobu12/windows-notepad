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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    Font fonts[] = ge.getAllFonts();
	    List<String> fontList = new ArrayList<>();
	    for (Font f : fonts){
	    	fontList.add(f.getName());
	    }
	    String[] fontArray = new String[fontList.size()];
		fontNameList.setItems(FXCollections.observableArrayList(fontList.toArray(fontArray)));
	}


}
