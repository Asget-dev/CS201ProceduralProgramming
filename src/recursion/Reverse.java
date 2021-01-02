package recursion;

public class Reverse {

	public static String reverse(String str) {
		if (str.equals(""))
			return str;
		else
			return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(reverse(str));
	}

}
