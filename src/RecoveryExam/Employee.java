package RecoveryExam;

public class Employee {
//	Both s1 and s2 refers to different objects.
//	When we use == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
//	Using equals, the result is true because its only comparing the values given in s1 and s2.
	private String firstName;

	public Employee(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Bob");
		Employee e2 = new Employee("Bob");

		// e2.setFirstName("Bob");
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

	}

}
