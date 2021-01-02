package RecoveryExam;

public class sumOf100WhileLoop {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;

		while (count <= 100) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);

		// other example
		// make sure to use break to stop the loop
		while (sum > 5000 || sum < 5050) {
			System.out.println("calculated");
			break;
		}

	}

}
