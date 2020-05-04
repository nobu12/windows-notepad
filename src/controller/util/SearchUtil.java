package controller.util;

import controller.MainController;
import controller.data.SearchData;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SearchUtil {
	public static int getStartIndex(TextField searchText, CheckBox caseSensitive,
			ToggleGroup searchMethodGroup, RadioButton upSearch) {
		TextArea textArea = MainController.getTextArea();
		String target = "";
		// 次を検索から本メソッドが呼ばれた場合
		if (searchText == null) {
			target = SearchData.getSearchString();
		} else {
			target = searchText.getText();
			SearchData.setSearchString(target);
		}

		int anchor = textArea.getAnchor() + 1;
		if (textArea.getSelectedText().indexOf(target) == -1) {
			anchor = textArea.getAnchor();
		}

		int start = 0;
		if (caseSensitive != null && caseSensitive.isSelected()) {
			start = textArea.getText().indexOf(target, anchor);
		} else {
			start = textArea.getText().toLowerCase().indexOf(target.toLowerCase(), anchor);
		}
		if (upSearch != null && upSearch == searchMethodGroup.getSelectedToggle()) {
			anchor = textArea.getAnchor() - 1;
			if (caseSensitive.isSelected()) {
				start = textArea.getText().lastIndexOf(target, anchor);
			} else {
				start = textArea.getText().toLowerCase().lastIndexOf(target.toLowerCase(), anchor);
			}
		}
		return start;
	}
}
