package two;

import java.util.ArrayList;

public class day36a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonL Aarik = new PersonL("aarik", "tuladhar");
		PersonL Aarik1 = new PersonL("aarik1", "tuladhar");
		PersonL Aarik2 = new PersonL("aarik2", "tuladhar");
		PersonL Aarik3 = new PersonL("aarik3", "tuladhar");
		PersonL Aarik4 = new PersonL("aarik4", "tuladhar");

		ArrayList<PersonL> students = new ArrayList<>();

		students.add(Aarik);
		students.add(Aarik1);
		students.add(Aarik2);
		students.add(Aarik3);
		students.add(Aarik4);

		students.get(0).display();

		// looping through

		for (PersonL x : students) {
			System.out.println(x.firstName);
			System.out.println(x.lastName);
			x.display();
		}

	}

}

class PersonL {
	String firstName;
	String lastName;

	public PersonL(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void display() {
		System.out.println(this.firstName + this.lastName);

	}
}
