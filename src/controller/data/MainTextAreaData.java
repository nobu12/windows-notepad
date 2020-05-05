package controller.data;

public class MainTextAreaData {
	private static MainTextAreaData mainTextAreaData = new MainTextAreaData();
	private static String previousString;

	public static MainTextAreaData getInstance() {
		return mainTextAreaData;
	}

	public static void setPreviousString(String searchString) {
		MainTextAreaData.previousString = searchString;
	}

	public static String getPreviousString() {
		return previousString;
	}
}
