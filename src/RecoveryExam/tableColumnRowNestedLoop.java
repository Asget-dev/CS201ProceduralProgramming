package RecoveryExam;

public class tableColumnRowNestedLoop {

	public static void main(String[] args) {
		for (int row = 11; row <= 20; row++) {
			for (int column = 5; column <= 25; column += 5) {
				int value = 19 * column * row;
				System.out.print(value);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
