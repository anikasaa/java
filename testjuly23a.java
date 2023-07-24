package two;

public class testjuly23a {

	public static void main(String[] args) {

		SonG aarik = new SonG("mani", "tuladhar", "nirajan", "aarik");
		System.out.println(aarik.firstName);
		System.out.println(aarik.lastName);
		System.out.println(aarik.fFirstName);
		System.out.println(aarik.Sname);

		aarik.displayfName();
		aarik.displayGName();
		aarik.displaySName();

	}

}

class GrandfatherG {
	String firstName;
	String lastName;

	public GrandfatherG(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class FatherG extends GrandfatherG {

	String fFirstName;

	public FatherG(String firstName, String lastName, String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;

	}

	public void displayfName() {
		System.out.println(this.fFirstName + this.lastName);

	}

}

class SonG extends FatherG {

	String Sname;

	public SonG(String firstName, String lastName, String ffn, String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;

	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}

}
