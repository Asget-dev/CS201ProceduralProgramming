package ArrayLab10;

public class ArrayMax {

	public static void main(String[] args) {
		int[] arr = { 32, 12, 4, 15, 65, 20 };
		int min = arr[0];// stores the min elements so far[0,i]
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
