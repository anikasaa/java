package two;

import java.util.HashMap;
import java.util.Map;

public class day34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> students = new HashMap<>();

		students.put("anisha", 37);
		students.put("nirajan", 42);
		students.put("sahara", 33);
		students.put("aarik", 2);
		students.put("tara", 15);
		System.out.println(students);

		// Accessing the value from HashMap()
		int a = students.get("anisha");
		System.out.println(a);

		// check particular key exists
		boolean b = students.containsKey("nirajan");
		System.out.println(b);

		// total number of key value in HashMap()
		int c = students.size();
		System.out.println(c);

		// remove the value
		students.remove("aarik");
		System.out.println(students);

		// update the value
		students.put("nirajan", 38);
		System.out.println(students);

		// looping through HashMap

		System.out.println(students.values());
		System.out.println(students.keySet());

		// looping over it using above method

		for (String key : students.keySet()) {
			System.out.println(key);
		}

		for (int value : students.values()) {
			System.out.println(value);

		}

	}

}
