package recursion;

public class sum {
	public static void add(int n) {// s="34267159"
		if (n == 0) {
			System.out.println("done");
		} else {
			System.out.println(n);
			n--;
			add(n);
		}
	}

	public static void countforward(int x) {
		if (x == 0) {
			System.out.println("done");
		} else {
			System.out.println(x);
			x--;
			countforward(x);
		}
	}

	public static int sum(int x) {
		if (x == 1 || x == 0)
			return 1;
		else

			return x * sum(x - 1);
	}

	public static void main(String[] args) {
		int f = sum(5);
		System.out.println(f);
//		add(5);
//		countforward(10);
	}

}
