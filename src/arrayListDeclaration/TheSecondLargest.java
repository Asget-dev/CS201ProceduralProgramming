package arrayListDeclaration;

public class TheSecondLargest {

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5, 6 };
		int max = x[0];
		int secMax = x[0];
		for (int i = 1; i < x.length; i++) {
			if (max < x[i]) {
				secMax = max;
				max = x[i];
			} else if (x[i] > secMax) {

				secMax = x[i];
			}
		}
		System.out.println(secMax);
	}
}
