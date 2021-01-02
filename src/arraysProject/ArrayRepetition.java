package arraysProject;

public class ArrayRepetition {

	public static void main(String[] args) {
		String[] v = { "book", "paper", "computer", "pen", "book", "paper", "book", };
		for (int i = 0; i < v.length; i++) {
			for (int j = 1 + i; j < v.length; j++) {
				if (v[i].equals(v[j])) {
					System.out.println(v[j]);
				}
			}
		}

	}

}
