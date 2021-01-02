package RecoveryExam;

import java.util.Scanner;

public class initalsNameSubstring3 {

	public static void main(String[] args) {
		String firstName, midleName, lastName, familyName;
		System.out.println("Insert you full name: ");
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();

		int space = fullName.indexOf(" ");

		firstName = fullName.substring(0, space);
		familyName = fullName.substring(firstName.length() + 1, fullName.length());
		int space2 = familyName.indexOf(" ");
		midleName = familyName.substring(0, 1);
		lastName = familyName.substring(space2);

		System.out.println(firstName + " " + midleName + "." + " " + lastName);

	}

}
