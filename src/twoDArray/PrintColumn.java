package twoDArray;

public class PrintColumn {

	public static void main(String[] args) {
		String[][] array = new String[4][4];

		// array.length =# of rows
		// array[0] row of the 2d array, array[0].length =# of columns in the 0th row
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				array[row][col] = ("row: " + row + "col" + col);
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}

}
