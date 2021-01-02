package arraysProject;

import java.util.Scanner;

public class Phrase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please insert a phrase");
		String input = s.next();
		System.out.println(input.toUpperCase());

		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= '0' && c <= '9') {
				count++;
			}
		}
	}
}
