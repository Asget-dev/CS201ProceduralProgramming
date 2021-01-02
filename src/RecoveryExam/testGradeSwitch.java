package RecoveryExam;

import java.util.Scanner;

public class testGradeSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gradeLevel = scanner.nextInt();
		switch (gradeLevel) {
		case 4:
			System.out.println("Excellent");
			break;
		case 3:
			System.out.println("Good");
			break;
		case 2:
			System.out.println("Fair");
			break;
		case 1:
			System.out.println("Need to improve");
			break;
		}

	}

}
