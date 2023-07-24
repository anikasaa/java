package two;

class Aa {
	public void GreetA() {
		System.out.println("hello");
	}
}

class Bb {
	public void GreetB() {
		System.out.println("bye");
	}
}

// only class can be inherited in the child class

class Cc extends Aa {

}

public class revision26bextendsonlyoneclasscanbeinherited {

	public static void main(String[] args) {

		Cc Pizza = new Cc();
		Pizza.GreetA();

	}

}
