package RecoveryExam;

import java.util.Scanner;

public class initalsNameSubstring2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter what programing languge you like: ");
		String text = scanner.nextLine();
		int x = text.indexOf(" ");
		String Fname = text.substring(0, 1);
		System.out.println(Fname);
		String Lname = text.substring(text.length() - 1);
		System.out.println(Lname);
		int totalLength = text.length();
		System.out.println(totalLength);
	}

}
