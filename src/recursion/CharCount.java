package recursion;

public class CharCount {

	public static int count(String str) {
		if (str.equals(""))
			return 0;
		else
			return count(str.substring(1)) + 1;
	}

	public static void main(String[] args) {
		String str = "Hello Recursion";
		System.out.println(count(str));
	}

}