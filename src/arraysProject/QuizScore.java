package arraysProject;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {
		// double[] score = new double[4];
		ArrayList<Double> score = new ArrayList<>();
		double sum = 0;
		double avg;
		double input;
		Scanner scanner = new Scanner(System.in);

//		while (true) {
//			System.out.println("Enter a number");
//			input = scanner.nextDouble();
//			if (input== -1)
//				break;
//			score.add(input);
//		}
		for (int i = 0; i < score.size(); i++) {
			// score.add(input);
			input = scanner.nextDouble();
			if (input == -1)
				break;
			sum += input;
		}
		avg = sum / score.size();
		System.out.println(avg);
	}

}
