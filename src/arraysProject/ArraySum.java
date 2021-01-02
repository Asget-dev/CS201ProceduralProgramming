package arraysProject;

public class ArraySum {

	public static int add(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 5, 5 };
		add(num);
	}
}
