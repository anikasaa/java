package two;

public class revision22boverridingparentmethodwithconstructor {

	public static void main(String[] args) {
		// one parent 2 child method(overriding parent method save and loan with
		// constructor

		Rockland Boston = new Rockland("USA", "boston");
		Boston.loan();
		Boston.save();
		Boston.displayMessage();

	}

}

class Worldbank {
	String country;

	// with constructor

	public Worldbank(String cnt) {
		this.country = cnt;

	}

	public void save() {
		System.out.println("i am save method");
	}

	public void loan() {
		System.out.println("i am loan method");
	}

	public void displayMessage() {
		System.out.println("welcome to the worldbank");
	}
}

class BOA extends Worldbank {

	String branchName;

	public BOA(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;

	}

	// Overriding the parent method loan and save

	public void save() {
		System.out.println("i am save method from BOA");
	}

	public void loan() {
		System.out.println("i am loan method from BOA");
	}

}

class Rockland extends Worldbank {

	String branchName;

	public Rockland(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;
	}

	// Overriding the parent method save and loan

	public void save() {
		System.out.println("i am save method from Rockland");
	}

	public void loan() {
		System.out.println("i am loan method from Rockland");
	}

}
