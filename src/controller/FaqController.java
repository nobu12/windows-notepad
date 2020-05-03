package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class FaqController implements Initializable {

	@FXML
	private TreeView<String> faqTextView;

	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>("すべて表示");

		TreeItem<String> horizontalScroll = new TreeItem<>("水平方向にスクロールせずにすべての文字列を表示するにはどうすればいいですか。");
		horizontalScroll.getChildren().addAll(
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [書式] メニューをタップまたはクリックし、[右端で折り返す] をタップまたはクリックします。"));
		horizontalScroll.setExpanded(true);
		root.getChildren().add(horizontalScroll);

		TreeItem<String> fontStyleAndSize = new TreeItem<>("フォントのスタイルとサイズを変更するにはどうすればいいですか。");
		fontStyleAndSize.getChildren().addAll(
				new TreeItem<>("フォントのスタイルとサイズを変更すると、その部分だけでなく、そのファイル内のすべてのテキストの外観が変わります。"),
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [書式] メニューをタップまたはクリックし、[フォント] をタップまたはクリックします。"),
				new TreeItem<>("3.フォント、フォント スタイル、およびサイズを選択し、[OK] をタップまたはクリックします。"));
		fontStyleAndSize.setExpanded(true);
		root.getChildren().add(fontStyleAndSize);

		TreeItem<String> textEdit = new TreeItem<>("テキストの切り取り、コピー、貼り付け、または削除をするにはどうすればいいですか。");
		textEdit.getChildren().addAll(
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2.次のいずれかの操作を行います。"),
				new TreeItem<>("•テキストをある場所から別の場所に移動するには、テキストを選び、[編集] メニューをタップまたはクリックして、[切り取り] をタップまたはクリックします。"),
				new TreeItem<>("•2 か所で同じテキストを使うには、テキストを選び、[編集] メニューをタップまたはクリックして、[コピー] をタップまたはクリックします。"),
				new TreeItem<>("•切り取ったテキストまたはコピーしたテキストを貼り付けるには、ファイル内のテキストを貼り付ける位置をタップまたはクリックし、[編集] メニューをタップまたはクリックして、[貼り付け] をタップまたはクリックします。"),
				new TreeItem<>("•テキストを削除するには、テキストを選び、[編集] メニューをタップまたはクリックして、[削除] をタップまたはクリックします。"),
				new TreeItem<>("•直前の操作を元に戻すには、[編集] メニューをタップまたはクリックし、[元に戻す] をタップまたはクリックします。"));
		textEdit.setExpanded(true);
		root.getChildren().add(textEdit);

		TreeItem<String> saveFileExtended = new TreeItem<>("メモ帳ファイルは .txt 以外の形式で保存できますか。");
		saveFileExtended.getChildren().addAll(
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [ファイル] メニューをタップまたはクリックし、[名前を付けて保存] をタップまたはクリックします。"),
				new TreeItem<>("3. [名前を付けて保存] ダイアログ ボックスの [ファイルの種類] ボックスの一覧で、[すべてのファイル (*.*)] をタップまたはクリックします。"),
				new TreeItem<>("4.適用する拡張子を付けてファイル名を入力し、[保存] をタップまたはクリックします。"));
		saveFileExtended.setExpanded(true);
		root.getChildren().add(saveFileExtended);

		TreeItem<String> printDocment = new TreeItem<>("メモ帳のドキュメントを印刷するにはどうすればいいですか。");
		printDocment.getChildren().addAll(
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [ファイル] メニューをタップまたはクリックし、[印刷] をタップまたはクリックします。"),
				new TreeItem<>("3.使用するプリンターとオプションを選び、[印刷] をタップまたはクリックします。"),
				new TreeItem<>("ヒント"),
				new TreeItem<>("印刷するドキュメントの外観を決める設定を変更するには、[ファイル] メニューをクリックし、[ページ設定] をクリックします。"),
				new TreeItem<>("•用紙サイズを変更するには、[サイズ] ボックスで目的のサイズをタップまたはクリックします。"),
				new TreeItem<>("•給紙方法を変更するには、[給紙方法] ボックスで目的のトレイ名やフィーダーをタップまたはクリックします。"),
				new TreeItem<>("•ファイルを縦向きに印刷するには [縦] をタップまたはクリックします。ファイルを横向きに印刷するには [横] をタップまたはクリックします。"),
				new TreeItem<>("•余白を変更するには、[余白] ボックスのいずれかに幅を入力します。"),
				new TreeItem<>("印刷の問題が発生した場合は、「 Windows での印刷の問題を解決する方法」をご覧ください。"));
		printDocment.setExpanded(true);
		root.getChildren().add(printDocment);

		TreeItem<String> insertTimeAndDate = new TreeItem<>("時刻と日付をファイルに挿入するにはどうすればいいですか。");
		insertTimeAndDate.getChildren().addAll(
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2.ファイルで、時刻と日付を追加する位置をタップまたはクリックします。"),
				new TreeItem<>("3. [編集] メニューをタップまたはクリックし、[日付と時刻] をタップまたはクリックします。"));
		insertTimeAndDate.setExpanded(true);
		root.getChildren().add(insertTimeAndDate);

		TreeItem<String> replacementWord = new TreeItem<>("特定の文字列や単語を検索して置換するにはどうすればいいですか。");
		replacementWord.getChildren().addAll(
				new TreeItem<>("文字列や単語を検索するには"),
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [編集] メニューをタップまたはクリックし、[検索] をタップまたはクリックします。"),
				new TreeItem<>("3. [検索する文字列] ボックスに検索する文字列や単語を入力します。"),
				new TreeItem<>("4. [検索する方向] の [上へ] か [下へ] をタップまたはクリックし、現在のカーソルの位置からファイルの先頭または末尾までを検索します。"),
				new TreeItem<>("5. [次を検索] をタップまたはクリックします。"),
				new TreeItem<>("文字列や単語を置換するには"),
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [編集] メニューをタップまたはクリックし、[置換] をタップまたはクリックします。"),
				new TreeItem<>("3. [検索する文字列] ボックスに検索する文字列や単語を入力します。"),
				new TreeItem<>("4. [置換後の文字列] ボックスに置換後のテキストを入力します。"),
				new TreeItem<>("5. [次を検索] をタップまたはクリックし、[置換] をタップまたはクリックします。"),
				new TreeItem<>("すべてのテキストを一度に置換するには、[すべて置換] をクリックします。"),
				new TreeItem<>("ヒント"),
				new TreeItem<>("[検索する文字列] ボックスで指定した大文字および小文字と一致するテキストのみを検索または置換するには、[大文字と小文字を区別する] チェック ボックスをオンにします。"));
		replacementWord.setExpanded(true);
		root.getChildren().add(replacementWord);

		TreeItem<String> createHeaderAndFotter = new TreeItem<>("ヘッダーまたはフッターを作成するにはどうすればいいですか。");
		createHeaderAndFotter.getChildren().addAll(
				new TreeItem<>("ヘッダーとフッターには、ファイルの上余白および下余白に表示されるテキストが含まれます。ファイルを印刷するときに、ヘッダー情報とフッター情報は各ページに表示されます。"),
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [ファイル] メニューをタップまたはクリックし、[ページ設定] をタップまたはクリックします。"),
				new TreeItem<>("3. [ヘッダー] ボックスまたは [フッター] ボックスに、ヘッダーおよびフッターに使用するテキストを入力します。"));
		createHeaderAndFotter.setExpanded(true);
		root.getChildren().add(createHeaderAndFotter);

		TreeItem<String> moveSpecificLine = new TreeItem<>("メモ帳ファイルで特定の行に移動するにはどうすればいいですか。");
		saveFileExtended.getChildren().addAll(
				new TreeItem<>("メモ帳ファイルに行番号が表示されない場合でも、ファイルの特定の行に移動することができます。行は、ファイルの先頭から左端を数えていきます。"),
				new TreeItem<>("1. [メモ帳] をタップまたはクリックして開きます。"),
				new TreeItem<>("2. [編集] メニューをタップまたはクリックし、[行へ移動] をタップまたはクリックします。"),
				new TreeItem<>("3. [行番号] ボックスにカーソルのジャンプ先となる行の番号を入力し、[移動] をタップまたはクリックします。"));
		moveSpecificLine.setExpanded(true);
		root.getChildren().add(moveSpecificLine);

//		faqTextView.setStyle("-fx-focus-color: transparent;");
//		faqTextView.setStyle("-fx-faint-focus-color: transparent;");
		faqTextView.setRoot(root);
	}

}
