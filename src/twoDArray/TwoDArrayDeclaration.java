package twoDArray;

public class TwoDArrayDeclaration {

	public static void someMethod(float[] number) {
		number[2] = 1.5f;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };// {{1,2,3}{1,2,3}} the two brace shows we have two rows

		for (int row = 0; row < arr.length; row++) {// arr.length return how many rows in that array
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
