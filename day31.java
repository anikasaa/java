package two;

import java.util.ArrayList;

public class day31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonX Anisha = new PersonX("anisha", "tuladhar");
		PersonX Anisha1 = new PersonX("anisha1", "tuladhar");
		PersonX Anisha2 = new PersonX("anisha2", "tuladhar");
		PersonX Anisha3 = new PersonX("anisha3", "tuladhar");
		PersonX Anisha4 = new PersonX("anisha4", "tuladhar");

		ArrayList<PersonX> students = new ArrayList<>();

		students.add(Anisha);
		students.add(Anisha1);
		students.add(Anisha2);
		students.add(Anisha3);
		students.add(Anisha4);

		students.get(0).display();

		// for loop

		for (int i = 0; i < students.size(); i++) {
			// System.out.println(i);

			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();
		}

		// while loop                      

		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;

		}

		// for each loop

		for (PersonX a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.display();

		}

	}
             
}

class PersonX {
	String firstName;
	String lastName;

	public PersonX(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;

	}

	public void display() {
		System.out.println(this.firstName + this.lastName);
	}

}
