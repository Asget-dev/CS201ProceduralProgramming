package RecoveryExam;

public class addEveryFourNumber {
	public static int addEvenfour(int x) {
		int num1 = 0;
		int sum = 0;
		while (num1 <= x) {
			if (num1 % 4 == 0) {
				sum = num1 + sum;
			}
			num1++;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(addEvenfour(27));

	}

}
