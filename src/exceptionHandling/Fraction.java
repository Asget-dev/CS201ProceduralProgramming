package exceptionHandling;

public class Fraction {
	private int numerator;
	private int denominator;

	// denom cannot be 0
	public Fraction(int num, int denom) throws IllegalArgumentException {
		numerator = num;// setNumerator(num);
		denominator = denom;// setDenominator(denom);
	}

	// denom cannot be 0
	public void setDenominator(int denom) throws IllegalArgumentException {
		denominator = denom;
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	public static Fraction add(Fraction f1, Fraction f2) throws IllegalArgumentException {
		// Exception IllegalArgumentException = new IllegalArgumentException("The value
		// is to small");
		if (f1.denominator == 0 || f2.denominator == 0)
			throw new IllegalArgumentException(" amount cannot be 0");
		int a, b, c, d;
		Fraction sum;
		a = f1.getNumerator();
		b = f1.getDenominator();
		c = f2.getNumerator();
		d = f2.getDenominator();
		sum = new Fraction(a * d + b * c, b * d);
		return sum;
	}

	public static Fraction divide(Fraction f1, Fraction f2) throws IllegalArgumentException {
		add(f1, f2);
		int a, b, c, d;
		Fraction quotient;
		a = f1.getNumerator();
		b = f1.getDenominator();
		c = f2.getNumerator();
		d = f2.getDenominator();
		quotient = new Fraction(a * d, b * c);
		return quotient;
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public String toString() throws IllegalArgumentException {
		return getNumerator() + "/" + getDenominator();
	}

	public static void main(String[] args) throws IllegalArgumentException {
		Fraction f1 = new Fraction(4, 0);
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator());// syso(f1.toString)
		Fraction f2 = new Fraction(3, 4);
		Fraction sum = Fraction.add(f1, f2);
		Fraction quotient = Fraction.divide(f1, f2);
		System.out.println(sum);
		System.out.println(quotient);
	}
}
