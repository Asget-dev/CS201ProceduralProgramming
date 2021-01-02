package recursion;

public class Exponent {

	public static double exp(double b, int e) {
		if (e == 0)
			return 1;
		if (e == 1)
			return b;
		if (e <= -1)
			return exp((1 / b), (e * -1));
		else
			return b * exp(b, e - 1);
	}

	public static void main(String[] args) {
		System.out.println(exp(2, -3));
	}
}
