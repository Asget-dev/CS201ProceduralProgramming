package recursion;

public class Factorial {
	public static int factorial(int N) {
		if (N == 1 || N == 0)
			return 1;
		else
			return N * factorial(N - 1);
	}

	public static int fibonaci(int f) {
		if (f == 1 || f == 0)
			return f;
		else {
			return fibonaci(f - 1) + fibonaci(f - 2);
		}
	}

	public static void main(String[] args) {
		int F = factorial(5);
		int fib = fibonaci(8);
		System.out.println(F);
		System.out.println(fib);
	}

}
