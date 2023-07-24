package two;

public class revision17acreatingclass {

	public static void main(String[] args) {

		// after creating class you create an instance and object

		Human Anisha = new Human();
		System.out.println(Anisha.age);
		System.out.println(Anisha.name);
		Anisha.walk();
		Anisha.talk();

		Anisha.age = 37;
		Anisha.name = "Anisha Tuladhar";
		System.out.println(Anisha.age);
		System.out.println(Anisha.name);

		Human Sahara = new Human();
		System.out.println(Sahara.age);
		System.out.println(Sahara.name);
		Sahara.walk();
		Sahara.talk();

		Sahara.age = 6;
		Sahara.name = "Sahara Tuladhar";
		System.out.println(Sahara.age);
		System.out.println(Sahara.name);

	}

}

class Human {

	int age;
	String name;

	// methods

	public void talk() {
		System.out.println("i can talk");
	}

	public void walk() {
		System.out.println("i can walk");

	}
}
