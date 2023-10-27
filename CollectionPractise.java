package two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionPractise {

	public static void main(String[] args) {
		List<PersonB> people = new ArrayList<>();
		people.add(new PersonB("chinmay", "deshpande", 23));
		people.add(new PersonB("sarika", "pansare", 25));
		people.add(new PersonB("mayuri", "deshpande", 21));
		people.add(new PersonB("sumit", "kanhe", 43));
		people.add(new PersonB("satish", "rai", 25));
		people.add(new PersonB("mayuri", "deshpande", 12));

		// ["chinmay","sarika","mayuri","sumit","satish","mayuri"]
		// program 1
		// Filtering : Get people older than 30

		List<PersonB> above30 = people.stream().filter(x -> x.getAge() > 30).collect(Collectors.toList());

		above30.forEach(x -> System.out.println(x.displayName()));

		// program 2
		// Filtering based on name : "Mayuri"
		List<PersonB> filterOnName = people.stream().filter(x -> x.displayName().contains("mayuri"))
				.collect(Collectors.toList());

		filterOnName.forEach(x -> System.out.println(x.displayName()));

		// program 3
		// Collecting only the names in one list
		List<String> names = people.stream().map(x -> x.firstName).collect(Collectors.toList());
		names.forEach(x -> System.out.println(x));

		// program 4

		List<Integer> ages = people.stream().map(x -> x.age).collect(Collectors.toList());
		int sum = ages.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum / people.size());

		int avg = people.stream().map(x -> x.age).collect(Collectors.toList()).stream().reduce(0, (x, y) -> x + y)
				/ people.size();
		
		
		  

		// 100 --- people
		// above-30 ---- 12 results
		// api -- 100 ----- 12 results

		// [11,22,33,44,55] =====> [13,24,35,46,57] -map
		// [33,44,55,22,33,56] ====> [55,56] - filter
		// [11,22,33] =====> 66 - reduce

	}

}

class PersonB {

	String firstName;
	String lastName;
	int age;

	public PersonB(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public String displayName() {
		return (this.firstName + this.lastName);
	}

	public int getAge() {
		return this.age;

	}

}
