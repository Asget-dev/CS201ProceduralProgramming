package finalExamExcersice;

public class ExersiceForFina {
	public String name(String x, String y) {
		System.out.println(y.substring(0, 1) + x.substring(0, 1));
		return x;
	}

	public static void main(String[] args) {
		ExersiceForFina fname = new ExersiceForFina();
		fname.name("hello", "Mama");
	}
}
