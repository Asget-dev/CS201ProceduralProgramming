package RecoveryExam;

public class compareTo {

	public static boolean compareToString(String x, String y) {

		if (x.compareTo(y) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(compareToString("hello", "hello"));
	}
}
//String s1 = "A"; 
//String s2 = "A"; 
//String s3 = "a"; 
//String s4 = new String("A"); 
//
//// Compare s1 and s2 
//// It should return 0 as they both 
//// have the same ASCII value 
//System.out.println(s1 + " .compareTo " + s2 
//                 + ": " + s1.compareTo(s2)); 