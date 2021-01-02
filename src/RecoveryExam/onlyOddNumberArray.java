package RecoveryExam;

import java.util.Arrays;

//write a method called only odd which takes init[] as an argument and return an int[] 
//which has only odd from the original int[] 
public class onlyOddNumberArray {
	public static int[] oddNumberCounting(int[] x) {
		int y = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				y++;
			}
		}

		int number[] = new int[y];
		int z = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 != 0) {
				number[z] = x[i];
				z++;
			}
		}
		return number;

	}

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(oddNumberCounting(x)));
	}

}
