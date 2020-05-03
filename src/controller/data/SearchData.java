package controller.data;

public class SearchData {
	private static SearchData searchData = new SearchData();
	private static String searchString;

	public static SearchData getInstance() {
		return searchData;
	}

	public static void setSearchString(String searchString) {
		SearchData.searchString = searchString;
	}

	public static String getSearchString() {
		return searchString;
	}
}
