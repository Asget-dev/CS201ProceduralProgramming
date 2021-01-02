package RecoveryExam;

public class allCharactorsAreX {
	// write a method to check if all the charactors are x
	// example s = "xxx" ----> return true
	public static boolean countX(String x) {
		int sum = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != 'x') {
				return false;
			}
			sum++;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(countX("xxx"));

	}

}
