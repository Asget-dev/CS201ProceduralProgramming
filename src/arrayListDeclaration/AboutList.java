package arrayListDeclaration;

import java.util.ArrayList;

public class AboutList {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Person p1 = new Person("Andy", 45, 'M');
		Person p2 = new Person("Andy", 45, 'M');
		list.add(p1);
		list.add(p2);
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.get(0).getName());

		ArrayList<String> anotherList = new ArrayList<>();// String
		anotherList.add("abc");// the input also string

	}

}
