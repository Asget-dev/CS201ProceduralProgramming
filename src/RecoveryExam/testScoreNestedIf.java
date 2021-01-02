package RecoveryExam;

import java.util.Scanner;

public class testScoreNestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your test score");
		double testScore = scanner.nextDouble();
		System.out.println("Enter your age");
		int studentAge = scanner.nextInt();
		if (testScore >= 70) {
			if (studentAge < 10) {
				System.out.println("you did a greate job");
			} else {
				System.out.println("you did pass");
			}
		} else {
			System.out.println("you did not pass");
		}

	}

}
