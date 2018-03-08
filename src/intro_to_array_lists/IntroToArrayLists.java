package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {

	public static void main(String[] args) {
		// 1. Create an array list of Strings
		ArrayList<String> array = new ArrayList();
		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		array.add("bob");
		array.add("rob");
		array.add("ceb");
		array.add("dob");
		array.add("hob");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			String text = array.get(i);
			System.out.println(i + " " + text);
		}
		System.out.println("\n");

		// 4. Print all the Strings using a for-each loop
		for (String text : array) {
			System.out.println(text);
		}
		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < array.size(); i += 2) {
			String text = array.get(i);
			System.out.println(text + " " + i);
		}
		System.out.println("\n");
		// 6. Print all the Strings in reverse order.
		for (int i = array.size() - 1; i >= 0; i--) {
			String text = array.get(i);
			System.out.println(text + " " + i);
		}
		System.out.println("\n");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String text : array) {
			if (text.contains("e")) {
				System.out.println(text);
			} else {
			
			}

		}
	}
}
