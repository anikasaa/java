package two;

public class revision25aabstractmethod {

	public static void main(String[] args) {

		BOAa boston = new BOAa();
		boston.loan();
		boston.save();
		boston.displayCountry();
		boston.branchName();

		Citizens bostonb = new Citizens();
		bostonb.loan();
		bostonb.save();
		bostonb.displayCountry();
		bostonb.branchName();

	}

}

abstract class WorldbankS {

	// abstract method

	abstract void loan();

	abstract void save();

	public void displayCountry() {
		System.out.println("i am from Massachusetts");
	}
}

//we cannot create object of abstract class

class BOAa extends WorldbankS {

	public void loan() {
		System.out.println("i am loan from BOA");

	}

	public void save() {
		System.out.println("i am save from BOA");

	}

	public void branchName() {
		System.out.println("i am boston branch");
	}

}

class Citizens extends WorldbankS {

	public void loan() {
		System.out.println("i am loan from citizens");

	}

	public void save() {
		System.out.println("i am save from citizens");

	}

	public void branchName() {
		System.out.println("i am boston brach-citizens");
	}

}