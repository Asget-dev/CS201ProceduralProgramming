package RecoveryExam;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double inputOne = input.nextDouble();
		System.out.println("Enter the second number");
		double inputTwo = input.nextDouble();
		System.out.println("Enter the threed number");
		double inputThree = input.nextDouble();

		if (inputOne > inputTwo && inputOne > inputThree) {
			System.out.println(inputOne + "is a larget number");
		} else if (inputTwo > inputThree) {
			System.out.println(inputTwo + "is a largest number");
		} else {
			System.out.println(inputThree + "is a largest number");
		}

	}

}
