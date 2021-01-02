package RecoveryExam;

public class whileLoopToForloop {

	public static void main(String[] args) {
		double product = 1;
		int i = 0;
		for (i = 0; i <= 20; i++) {
			product = product * Math.pow(2, i);
		}
		System.out.println(product);

		// Using while loop
		while (i <= 20) {
			product = product * Math.pow(2, i);
		}
		System.out.println(product);

		int x = 1;
		int y = 2;
		System.out.println("The output is " + x + y);
		System.out.println("The output is" + (x + y));
	}

}
