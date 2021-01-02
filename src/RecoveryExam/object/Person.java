package RecoveryExam.object;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private char gender;// F OR M

	public Person() {

	}

	public Person(String n, int a, char g) {
		name = n;
		age = a;
		gender = g;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setGender(char g) {
		this.gender = g;
	}

	public static void main(String[] args) {
		// in java, in addition to arrays of primitive data type, we can declare array
		// of objects
		// Person[] person; when we do this it means only the name person is declared,
		// no array is allocated yet.(its null)
		// Person[] person = new Person[10]// now the array for storing 10 Person object
		// is created and each element is null. The person objects themselves are not
		// yet created.
		// person[0]=new Person()//This point one Person object is created and the
		// reference to this object is placed in position 0.
		Scanner scanner = new Scanner(System.in);
		Person[] person = new Person[2];// This is how to create a person object
		String name, inpStr;
		int age;
		char gender;

		for (int i = 0; i < person.length; i++) {
			System.out.println("Enter name: ");// read in data values
			name = scanner.next();
			System.out.println("Enter age: ");
			age = scanner.nextInt();
			System.out.println("Enter gender");
			inpStr = scanner.next();// the return type is string
			gender = inpStr.charAt(0);// convert the string type to character

			person[i] = new Person(name, age, gender);
			// create a new Person and store in the array
			// person[i] = new Person(name, age, gender);//to create person object
//			person[i].setName(name);
//			person[i].setAge(age);
//			person[i].setGender(gender);
		}
		for (int i = 0; i < person.length; i++) {
			Person p = person[i];
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getGender());
		}
//---------------------------Compute Average Age-----------------------------------------------//
		float sum = 0;
		float averageAge;
		for (int i = 0; i < person.length; i++) {
			sum += person[i].getAge();// Person p = person[i];//sum += p.getAge();
		}
		averageAge = sum / person.length;
		System.out.println(averageAge);
		System.out.println("\n");

// ---------------------------Compute Max Age-----------------------------------------------//
		int minIdx = 0;
		int maxIdx = 0;
		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < person[minIdx].getAge()) {
				minIdx = i;
			}
			if (person[i].getAge() > person[maxIdx].getAge()) {
				maxIdx = i;
			}
		}
		System.out.println("Youngest: is " + person[minIdx].getAge() + " years old.");
		System.out.println("Oldest: is      " + person[maxIdx].getAge() + " years old.");
		System.out.println("Youngest is in this position of the array: " + minIdx);
		System.out.println("Youngest is in this position of the array: " + maxIdx);
// ---------------------------Search for a particular person-----------------------------------------------//
//i is in [0,length-1] is searchName exists in the array
//i is length is searchName dose not exist in the array  ....i==length
		System.out.println("Name to Seach");
		String searchName = scanner.next();
		int i = 0;
		while (i < person.length && !person[i].getName().equalsIgnoreCase(searchName)) {
			i++;
		}
		if (i == person.length) {
			// not found -unsuccessful search
			System.out.println("Sorry there is no name under that name");
		} else {
			// person[i] = null; if you want to delete the person;
			System.out.println("Found " + searchName + " at position" + i);// we found the name
		}
	}

}
