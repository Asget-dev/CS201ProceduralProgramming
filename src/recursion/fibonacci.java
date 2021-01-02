package recursion;

public class fibonacci {
	public static int fib(int x) {
		if (x == 0 | x == 1)
			return 1;
		else
			return fib(x - 1) + (x - 2);
	}

	public static void main(String[] args) {
		int i = fib(5);
		System.out.println(i);

	}

}
