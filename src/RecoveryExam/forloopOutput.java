package RecoveryExam;

public class forloopOutput {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j = j + 2) {
				System.out.println("i: " + i + "j: " + j);
				if (j == 3) {
					break;
				}
			}
		}

	}

}
