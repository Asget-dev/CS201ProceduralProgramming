package recursion;

public class Palindrom {

	public static boolean palindrom(String str) {
		if (str.length() <= 1)
			return true;
		else
			return (str.charAt(0) == str.charAt(str.length() - 1)) && palindrom(str.substring(1, str.length() - 1));
	}

	public static void main(String[] args) {
		String str = "noon";
		System.out.println(palindrom(str));

	}

}
