package ArrayLab10;

import java.util.Scanner;

public class AddressBook {

	public static void main(String[] args) {
		String name;
		String phone;
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the size of the array");
		int size = s.nextInt();
		Person_[] entrie = new Person_[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Please input the name: ");
			name = s.next();
			System.out.println("Please input the phone number: ");
			phone = s.next();
			entrie[i] = new Person_(name, phone);
		}
		System.out.println("Now printing the array....");
		for (int i = 0; i < size; i++) {
			Person_ p = entrie[i];
			System.out.print(p.getName() + " ");
			System.out.println(p.getPhone());
		}
		System.out.println("Name to Search");
		String searchName = s.next();
		int i = 0;
		while (i < entrie.length && !entrie[i].getName().equalsIgnoreCase(searchName)) {
			i++;
		}
		if (i == entrie.length) {
			System.out.println("Sorry there is no name under that name");
		} else {
			System.out.println("Found " + searchName + "at position" + i);
		}
	}

}
