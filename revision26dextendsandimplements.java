package two;

interface Five1 {
	public void methodFive();
}

interface Six1 {
	public void methodSix();
}

interface Seven1 {
	public void methodSeven();

}

public class revision26dextendsandimplements {

	public static void main(String[] args) {

		Nine MethNine = new Nine();
		MethNine.EightA();
		MethNine.EightB();
		MethNine.methodSix();
		MethNine.methodSeven();

	}

}

class Eight {
	public void EightA() {
		System.out.println("first method for class eight");
	}

	public void EightB() {
		System.out.println("secomd method for class eight");
	}
}

class Nine extends Eight implements Six1, Seven1 {

	public void methodSeven() {
		System.out.println("i am from interface seven");

	}

	public void methodSix() {
		System.out.println("i am from interface six");

	}

}
