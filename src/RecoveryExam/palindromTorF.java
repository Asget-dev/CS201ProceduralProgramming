package RecoveryExam;

public class palindromTorF {

	public static boolean isPalindrom(String s1) {
		String text = "";
		int length = s1.length();
		for (int i = length - 1; i >= 0; i--) {
			text = text + s1.charAt(i);
		}
		if (s1.equals(text)) {
			return true;
		} else {
			return false;
		}

	}
}
