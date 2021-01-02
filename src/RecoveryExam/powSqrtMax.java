package RecoveryExam;

public class powSqrtMax {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = 16;
		double d = 16.6;
		double power = Math.sqrt(c);
		double sqrt = Math.pow(c, b);
		double max = Math.max(a, b);
		double max2 = Math.max(max, c);
		int B = 2;
		int A = 5;
		int C = 4;
		double D = Math.sqrt((Math.pow(B, 2)) + (4 * A * C));
		double E = Math.sqrt(B + (4 * Math.pow(A, 3)));
		double F = Math.cbrt(A * B);
		double G = Math.PI * (Math.pow(A, 2));

		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
		System.out.println(G);

		System.out.println(power);
		System.out.println(sqrt);
		System.out.println(max);
		System.out.println(max2);

	}

}
