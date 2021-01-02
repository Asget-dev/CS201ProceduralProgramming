package twoDArray;

public class Average2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 6, 3 }, { 4, 5, 6 }, { 4, 2, 7, 9 } };// {{1,2,3}{1,2,3},{4,2,7,9}} the brace shows how
																	// many rows that we
		// have

		// Compute the average of row
		double[] avg = new double[arr.length];
		for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {// arr.length return how many rows in that array
			double sum = 0;
			for (int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++) {
				sum += arr[rowIndex][colIndex];

			}
			System.out.print(sum);
			avg[rowIndex] = sum / arr[rowIndex].length;
			System.out.println();
			System.out.println(avg[rowIndex]);
		}

	}

}
