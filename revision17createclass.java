package two;

public class revision17createclass {

	public static void main(String[] args) {

		PersonAa Anisha = new PersonAa();
		System.out.println(Anisha.age);
		System.out.println(Anisha.fullname);
		Anisha.age = 37;
		Anisha.fullname = "Anisha Tuladhar";

		System.out.println(Anisha.age);
		System.out.println(Anisha.fullname);

		PersonBb Nirajan = new PersonBb("Nirajan Tuladhar", 42);
		Nirajan.displayName();

		PersonBb Sahara = new PersonBb("Sahara Tuladhar", 6);
		Sahara.displayName();

	}

}

class PersonAa {
	// properties
	// methods

	int age;
	String fullname;

	public void displayName() {
		System.out.println(this.fullname);
	}

}

class PersonBb {

	String fullname;
	int age;

	public PersonBb(String fn, int ag) {
		this.fullname = fn;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.fullname);
	}

}
