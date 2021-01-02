package RecoveryExam;

public class howManyXYZ {

	public static int how_Many_Of_Xyz(String s1) {
		int count = 0;
		int sum = 0;
		for (int j = 0; j < s1.length(); j++) {
			if ((s1.charAt(j) == 'X') || (s1.charAt(j) == 'x') || (s1.charAt(j) == 'Y') || (s1.charAt(j) == 'y')
					|| (s1.charAt(j) == 'Z')

					|| (s1.charAt(j) == 'z')) {
				sum++;
			}

		}
		return sum;
	}

	public static void main(String[] args) {
		int x = how_Many_Of_Xyz("how_Many_Of_Xyz");
		System.out.println(x);

	}

}
