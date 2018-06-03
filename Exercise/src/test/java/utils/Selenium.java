package utils;

public class Selenium {
	public static String getIdentifier(String objectName, String value) {
		if (objectName.indexOf("-id") >= 0 && objectName.indexOf("-id ") < 0) {
			return "ID=" + value;
		}
		if (objectName.indexOf("-xp") >= 0 && objectName.indexOf("-xp ") < 0) {
			return "XPATH" + value;
		}
		if (objectName.indexOf("-name") >= 0 && objectName.indexOf("-name ") < 0) {
			return "NAME" + value;
		}
		System.out.println("Error");
		return null;

	}

	public static void click(String objectName, String value) {
		if (objectName.contains("-id") == true && objectName.contains("-id ") == false ) {
			System.out.println("ID=" + value);
		}
		if (objectName.contains("-xp") == true && objectName.contains("-xp ") == false) {
			System.out.println("XP=" + value);
		}
		if (objectName.contains("-name") == true && objectName.contains("-name ") == false) {
			System.out.println("NAME=" + value);
		}

	}
}
