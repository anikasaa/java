package two;

import java.util.ArrayList;

public class day32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<>();

		// add()

		boolean a = names.add("sahara");
		System.out.println(a);
		names.add("aarik");
		names.add("anisha");
		names.add("nirajan");
		System.out.println(names);

		// add(position, element)
		names.add(3, "barsha");
		System.out.println(names);

		// remove

		names.remove(2);
		System.out.println(names);
		names.remove("anisha");
		System.out.println(names);

		// clear()

		names.clear();
		System.out.println(names);

		names.add("sadhana");
		names.add("raju");
		names.add("ashray");
		names.add("sanav");
		names.add("barsha");
		System.out.println(names);

		// set()

		names.set(1, "saurav");
		System.out.println(names);

		// contains()
		boolean a1 = names.contains("sadhana");
		System.out.println(a1);

		// get()

		String eleAtIndex2 = names.get(2);
		System.out.println(eleAtIndex2);

		// indexOf()

		int nums = names.indexOf("barsha");
		System.out.println(nums);

		int nums2 = names.indexOf("Barsha");
		System.out.println(nums2);

		ArrayList<String> animals = new ArrayList<>();
		animals.add("dog");
		animals.add("cat");
		animals.add("rabbit");
		animals.add("fox");
		System.out.println(animals);

		String userInput = "cat";
		if (animals.contains(userInput)) {
			System.out.println("element available");
		} else {
			System.out.println("element is not available");
		}

		// indexOf()

		if (animals.indexOf("dog") >= 0) {
			System.out.println("element avaible");
		} else {
			System.out.println("element not available");
		}

		ArrayList<String> cities = new ArrayList<>();
		cities.add("boston");
		cities.add("malden");
		cities.add("melrose");
		cities.add("medford");
		cities.add("boston");

		System.out.println(cities.size());
		System.out.println(cities);

		// [boston, malden, melrose, medford, boston]

		System.out.println(cities.indexOf("boston"));
		System.out.println(cities.lastIndexOf("boston"));

	}

}
