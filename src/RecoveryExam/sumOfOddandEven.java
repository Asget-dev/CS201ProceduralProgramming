package RecoveryExam;

import java.util.Scanner;

public class sumOfOddandEven {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Please enter a positive number");
		int y = x.nextInt();
		int sum1 = 0;
		int sum2 = 0;

		while (y < 0) {
			System.out.println("Please enter a positive number");
			y = x.nextInt();
		}

		if (y > 0) {
			for (int i = 0; i <= y; i++) {// 1 1<2
				if (i % 2 == 0) {// 1%2
					sum1 = sum1 + i;

				} else {
					sum2 = sum2 + i;
				}

			}
		}

		System.out.println(sum1);
		System.out.println(sum2);

	}

}
