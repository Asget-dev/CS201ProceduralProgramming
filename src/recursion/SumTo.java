package recursion;

public class SumTo {

	public static double num(double N) {
		if (N <= 0)
			throw new IllegalArgumentException("s");
		if (N == 1)
			return 1;
		else
			return (1 / N) + num(1 / (N - 1));
	}

	public static void main(String[] args) throws IllegalArgumentException {
		double x = num(3);
		System.out.println(x);
	}

}
