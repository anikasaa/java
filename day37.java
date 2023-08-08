package two;

import java.util.Arrays;
import java.util.List;

public class day37 {

	public static void main(String[] args) {

		// Stream==API testing

		// count of blank strings

		List<String> names = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> x.isEmpty()).count());

		// taking the blank string to list

		List<String> names1 = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> x.isEmpty()).toList());

		// only the string

		List<String> name2 = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> !x.isEmpty()).toList());

		// names start with "s"

		List<String> name3 = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> x.startsWith("s")).toList());

		// contains "i"

		List<String> name4 = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> x.contains("i")).toList());

		// string greater than 4

		List<String> name5 = Arrays.asList("anisha", "", "nirajan", "aarik", "", "sahara");
		System.out.println(names.stream().filter(x -> x.length() > 4).toList());

		// working with every element with string(including all the elements)
		// filter (filtering out the elements and not working with all the elements)

		List<Integer> transactions = Arrays.asList(500, 600, -900, -1000, 700, -300);

		// deposit
		System.out.println(transactions.stream().filter(tra -> tra > 0).toList());

		// withdrawals
		System.out.println(transactions.stream().filter(tra -> tra < 0).toList());

		// convert every list in map to uppercase()

		List<String> countries = Arrays.asList("USA", "nepal", "India", "uk", "Australia");
		System.out.println(countries.stream().map(x -> x.toUpperCase()).toList());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers.stream().map(x -> x * 2).toList());

		List<Integer> salary = Arrays.asList(1000, 2000, 3000, 4000, 5000);
		System.out.println(salary.stream().map(x -> x + x * 0.10).toList());

	}

}
