package arrayListDeclaration;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList();
		System.out.println("Please input N: ");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Please input a value: ");
			double value = scanner.nextDouble();
			list.add(value);
		}
//		System.out.println());

	}

}
