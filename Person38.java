package two;

import java.util.List;
import java.util.stream.Collectors;

public class Person38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<PersonN> peoples = List.of(

				new PersonN("anisha tuladhar", 37, "boston"), new PersonN("barsha kansakar", 35, "kathmandu"),
				new PersonN("nirajan tuladhar", 42, "portland"), new PersonN("ashu kansakar", 25, "melrose")

		);

		List<PersonN> above30Age = peoples.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

		System.out.println(above30Age);

		for (int i = 0; i < above30Age.size(); i++) {
			System.out.println(above30Age.get(i).getAge());
			System.out.println(above30Age.get(i).getCity());
			System.out.println(above30Age.get(i).getName());

		}

		// program 2

		// Map and collect
		// ["anisha tuladhar", "barsha kansakar","nirajan tuladhar","ashu kansakar"]

		List<String> names = peoples.stream().map(person -> person.getName()).collect(Collectors.toList());

		for (String nm : names) {
			System.out.println(nm);
		}

		// program 3
		// person and city
		// "anisha tuladhar : boston"

		List<String> nnn =

				peoples.stream().map(person -> person.getName().concat(" :").concat(person.getCity()))
						.collect(Collectors.toList());

		for (String nc : nnn) {
			System.out.println(nc);
		}

	}

}

class PersonN {

	private String name;
	private int age;
	private String city;

	public PersonN(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}
}
