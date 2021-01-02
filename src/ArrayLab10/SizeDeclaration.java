package ArrayLab10;

import java.util.Scanner;

public class SizeDeclaration {

	public static void main(String[] args) {
		// in java, we are not linited to fixed-size array declaraion
		System.out.print("Size of an array ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		double[] number;
		number = new double[size];
		System.out.print("Array of size is " + number.length);
		for (int i = 0; i < number.length; i++) {
			System.out.println("Please input a value");
			double value = scanner.nextDouble();
			number[i] = value;
		}
	}

}
