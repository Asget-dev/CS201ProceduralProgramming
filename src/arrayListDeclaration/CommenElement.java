package arrayListDeclaration;

public class CommenElement {

	public static void main(String[] args) {
		int[] x = { 2, 4, 6, 8 };
		int[] y = { 1, 3, 4, 2 };
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}

}
