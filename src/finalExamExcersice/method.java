package finalExamExcersice;

public class method {
	public int sum(int a, int b) {
		int y = a + b;
		return y;
	}

	public static void main(String[] args) {
		method cal = new method();// if your method dosent have a static method
		int x = cal.sum(101, 20);
		System.out.println(x);
	}
}
