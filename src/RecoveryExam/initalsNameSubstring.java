package RecoveryExam;

import java.util.Scanner;

public class initalsNameSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fname = scanner.next();
		System.out.println("Enter your middle name");
		String mname = scanner.next();
		System.out.println("Enter your last name");
		String lname = scanner.next();

		String fullName = fname.substring(0, fname.length()) + " " + mname.charAt(0) + "."
				+ lname.substring(0, lname.length());
		System.out.println(fullName);

	}

}
