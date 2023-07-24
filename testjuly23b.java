package two;

public class testjuly23b {

	public static void main(String[] args) {
		// abstract class

		Rabbit R = new Rabbit();
		R.walk();
		R.eat();
		R.displayType();
		R.domesticPet();

	}

}

abstract class AnimalP {

	abstract void walk();

	abstract void eat();

	public void displayType() {
		System.out.println("i am a rabbit");
	}
}

class Rabbit extends AnimalP {

	void walk() {
		System.out.println("i can walk");

	}

	void eat() {
		System.out.println("i like to eat");

	}

	public void domesticPet() {
		System.out.println("i am a domestic animal");
	}

}

class CatT extends AnimalP {

	void walk() {
		System.out.println("i am a cat and i can walk");

	}

	void eat() {
		System.out.println("i am a cat and i like to eat");

	}

	public void domesticPet() {
		System.out.println("i am also a domestic animal");
	}

}