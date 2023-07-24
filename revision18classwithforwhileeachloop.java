package two;

public class revision18classwithforwhileeachloop {

	public static void main(String[] args) {

		// program 1

		Person[] students = { new Person("anisha", "tuladhar", 37), new Person("nirajan", "tuladhar", 42),
				new Person("sahara", "tuladhar", 6), new Person("aarik", "tuladhar", 2) };

		// using for loop

		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// using while loop

		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;

		}

		// using forEach loop

		for (Person student : students) {
			student.displayName();

		}

		// program 2 as calculator

		Calculator C1 = new Calculator();
		C1.addition(2, 3);
		C1.addition(2, 3, 5);
		C1.addition(2, 3, 5, 2);

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Calculator {

	public void addition(int a, int b) {
		System.out.println(a + b);

	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

}
