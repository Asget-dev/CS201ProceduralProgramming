package ArrayLab10;

import java.util.Scanner;

public class Declaration {

	public static void main(String[] args) {
		// array declaration
		// double[] rainfall = new double[12];
		// to accept a data from user and input in to array
		// Scanner scanner = new Scanner(System.in);
		// rainfall[i] = scanner.nextDouble();

		// other way to declare array
		// String [] monthName = {"Jan", "feb"};
		// or one by one monthName[0] = "Jan"; monthName[1] = "Feb";

		Scanner scanner = new Scanner(System.in);
		double[] rainfall = new double[12];
		String[] monthName = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double annualAverage;
		double sum = 0.0;

		for (int i = 0; i < rainfall.length; i++) {
			System.out.println("Rainfall for month " + (i + 1) + " " + monthName[i] + ": ");
			rainfall[i] = scanner.nextDouble();
			sum += rainfall[i];
		}
		annualAverage = sum / rainfall.length;
		System.out.println("Annual Average Rainfall: " + annualAverage);
	}

}
