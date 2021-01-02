package RecoveryExam;

import java.util.Scanner;

public class IsaPrimeOrNot {

	public static void primes(int number) {
		int i = 2;
		while (i < number) {
			if (number % i == 0) {
				System.out.println("is not prime");
				break;
			}
			i++;
			System.out.println("is prime");
			break;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		primes(num);

	}
}