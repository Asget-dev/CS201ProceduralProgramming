package RecoveryExam;

public class countDigits {
//write a method to count digits
	public static int how_many_digits(String x) {
		int sum = 0;
		for (int i = 0; i < x.length(); i++) {
			if ((x.charAt(i) == '1') || (x.charAt(i) == '8') || (x.charAt(i) == '9') || (x.charAt(i) == '6')
					|| (x.charAt(i) == '1')) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(how_many_digits("Hello 896,bye 12"));

	}

}
