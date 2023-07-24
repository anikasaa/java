package two;

public class revision23auseofsuperkeyword {

	public static void main(String[] args) {

		cat c = new cat();
		c.displayMessage();

	}

}

class Animal {
	public void display() {
		System.out.println("i am an animal");
	}
}

class cat extends Animal {
	public void display() {
		System.out.println("i am a domestic animal");
	}

	public void displayMessage() {
		display();
		super.display();
	}
}
