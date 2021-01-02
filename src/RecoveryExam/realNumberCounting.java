package RecoveryExam;

import java.util.Scanner;

public class realNumberCounting {
//write java code to do the following. write a while statement to read in real numbers and stop when a negative number is entered.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter real number");
		int x = scanner.nextInt();
		int count = 0;
		int count2 = 0;
		while (x > 0) {
			x = scanner.nextInt();
			count++;
			x++;
		}

	}

}
