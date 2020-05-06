package controller.data;

public class MainTextAreaData {
	private static MainTextAreaData mainTextAreaData = new MainTextAreaData();
	private static String previousString;
	private static boolean changed = false;

	public static MainTextAreaData getInstance() {
		return mainTextAreaData;
	}

	public static void setPreviousString(String searchString) {
		MainTextAreaData.previousString = searchString;
	}

	public static String getPreviousString() {
		return previousString;
	}

	public static boolean isChanged() {
		return changed;
	}

	public static void setChanged() {
		changed = true;
	}
}
