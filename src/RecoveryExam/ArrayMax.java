package RecoveryExam;

public class ArrayMax {

	public static void main(String[] args) {

		int number[] = { -1, 0, 2, 3, 4, 5, 6, 7 };
		int max = number[0];
		int min = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			} else if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println(min);
		System.out.println(max);

	}

}
