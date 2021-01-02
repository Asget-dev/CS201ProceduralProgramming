package arrayDemo;

public class Exercise1 {

	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 8 };
		System.out.println(array[3]);
		System.out.println(array.length);
 
		// 2x3
		int[][] array2 = { { 1, 2 }, { 5, 6, 5 }, { 5,5, 8 } };
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println(array2[3].length);
	}

}
