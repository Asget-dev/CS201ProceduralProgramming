package twoDArray;

public class PrintColByCol {

	public static void main(String[] args) {
		int intel[][] = { { 3, 55, 7 }, { 110, 2, 9 } };
		double avg;
		int max = intel[0][0];
		int min = intel[0][0];
		for (int i = 0; i < 2; i++) {
			double sum = 0;
			for (int j = 0; j < 3; j++) {
				if (max < intel[i][j]) {
					max = intel[i][j];
				}
				if (min > intel[i][j]) {
					min = intel[i][j];
				}
			}
			System.out.println(max);
			System.out.println(min);
		}

	}

}
