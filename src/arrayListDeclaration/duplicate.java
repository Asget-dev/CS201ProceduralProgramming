package arrayListDeclaration;

public class duplicate {

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 1, 5, 2 };
		for (int i = 0; i < x.length; i++) {
			for (int j = 1 + i; j < x.length; j++) {
				if (x[i] == x[j])
					System.out.println(x[i]);
			}
		}

	}

}
