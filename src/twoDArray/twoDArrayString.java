package twoDArray;

public class twoDArrayString {

	public static void main(String[] args) {
		String[][] array = new String[3][5];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = ("row: " + row + "col" + col);
				System.out.print(array[row][col]);
			}
			System.out.println();
		}

	}

}
