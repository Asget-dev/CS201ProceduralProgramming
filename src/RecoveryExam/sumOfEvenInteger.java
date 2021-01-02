package RecoveryExam;

public class sumOfEvenInteger {

	public static int addEven(int x, int y) {
		int sum = 0;
		while (y >= x) {
			if (x % 2 == 0) {
				sum = sum + x;
			}
			x++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int xx = addEven(-2, 8);
		System.out.println(xx);
	}

}
