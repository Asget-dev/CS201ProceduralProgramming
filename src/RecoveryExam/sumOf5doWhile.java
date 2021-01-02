package RecoveryExam;

public class sumOf5doWhile {

	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		do {
			sum = count + sum;
			count++;
		} while (sum <= 5);
		System.out.println(sum);
	}

}
