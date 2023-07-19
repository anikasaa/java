package two;

class A {
	public void GreetA() {
		System.out.println("hello");
	}
}

class B {
	public void GreetB() {
		System.out.println("bye bye");
	}
}

// only one class can be inherited in the child class

class C extends A {

}

public class day26B {

	public static void main(String[] args) {
		C Icecream = new C();
		Icecream.GreetA();

	}

}
