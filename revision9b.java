package two;

public class revision9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonA Anisha = new PersonA();
		System.out.println(Anisha.age);
		System.out.println(Anisha.fullname);
		Anisha.age = 37;
		Anisha.fullname = "Anisha Tuladhar";

		System.out.println(Anisha.age);
		System.out.println(Anisha.fullname);

		PersonA Sahara = new PersonA();
		Sahara.fullname = "Sahara Tuladhar";
		Sahara.age = 6;
		Sahara.displayName();

		PersonB Nirajan = new PersonB("Nirajan Tuladhar", 42);
		Nirajan.displayName();

		PersonB Aarik = new PersonB("Aarik Tuladhar", 2);
		Aarik.displayName();

	}

}

class PersonA {
	// properties
	// classfields

	int age;
	String fullname;

	public void displayName() {
		System.out.println(this.fullname);
	}
}

class PersonB {

	String fullName;
	int age;

	public PersonB(String fn, int ag) {
		this.fullName = fn;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.fullName);
	}
}
