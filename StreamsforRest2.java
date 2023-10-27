package two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsforRest2 {

	public static void main(String[] args) {
		List<PersonT> people = new ArrayList<>();
		people.add(new PersonT("Anisha", "Tuladhar", 37));
		people.add(new PersonT("Nirajan", "Tuladhar", 42));
		people.add(new PersonT("Sahara", "Tuladhar", 6));
		people.add(new PersonT("Aarik", "Tuladhar", 2));
		people.add(new PersonT("Barsha", "Kansakar", 35));
		people.add(new PersonT("Ashray", "Kansakar", 23));
		people.add(new PersonT("Anisha", "Tuladhar", 32));

		// age above 30
		List<PersonT> ageAbove30 = people.stream().filter(a -> a.getAge() > 30).collect(Collectors.toList());
		ageAbove30.forEach(a -> System.out.println(a.displayName()));

		// filter based on names
		List<PersonT> sameNames = people.stream().filter(b -> b.displayName().contains("Aarik"))
				.collect(Collectors.toList());
		sameNames.forEach(b -> System.out.println(b.displayName()));

		// collecting only names
		List<String> names = people.stream().map(c -> c.firstName).collect(Collectors.toList());
		names.forEach(c -> System.out.println(c));

		// average age of everyone
		List<Integer> allAge = people.stream().map(d -> d.getAge()).collect(Collectors.toList());
		int sum = allAge.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum / people.size());

		// sorting in accending order by age
		List<PersonT> sortedByAge = people.stream().sorted(Comparator.comparingInt(PersonT::getAge))
				.collect(Collectors.toList());

		sortedByAge.forEach(person -> System.out.println(person.displayName()));

		// count the number of people with same age
		Map<Integer, Long> ageCountMap = people.stream()
				.collect(Collectors.groupingBy(PersonT::getAge, Collectors.counting()));

		ageCountMap.forEach((age, count) -> {
			if (count > 1) {
				System.out.println("Age " + age + ": " + count + " people");
			}
		});

		// name of first 3 people where age > 30
		List<PersonT> firstThreeAbove30 = people.stream().filter(person -> person.getAge() > 30).limit(3)
				.collect(Collectors.toList());

		firstThreeAbove30.forEach(person -> System.out.println(person.displayName()));

		// distinct name list
		List<String> distinctNames = people.stream().map(person -> person.firstName).distinct()
				.collect(Collectors.toList());

		distinctNames.forEach(name -> System.out.println(name));

	}

}

class PersonT {
	String firstName;
	String lastName;
	int age;

	public PersonT(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public String displayName() {
		return (this.firstName + this.lastName);
	}

	public int getAge() {
		return (this.age);
	}
}
