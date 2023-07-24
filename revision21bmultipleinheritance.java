package two;

public class revision21bmultipleinheritance {

	public static void main(String[] args) {
		// multiple inheritance

		Son aarik = new Son("mani", "tuladhar", "nirajan", "aarik");
		System.out.println(aarik.firstName);
		System.out.println(aarik.lastName);
		System.out.println(aarik.fFirstNAme);
		System.out.println(aarik.Sname);

		aarik.displayfName();
		aarik.displayGName();
		aarik.displaySname();

	}

}

class Grandfather {
	String firstName;
	String lastName;

	public Grandfather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;

	}

	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends Grandfather {
	String fFirstNAme;

	public Father(String fn, String ln, String ffn) {
		super(fn, ln);
		this.fFirstNAme = ffn;

	}

	public void displayfName() {
		System.out.println(this.fFirstNAme + this.lastName);
	}

}

class Son extends Father {
	String Sname;

	public Son(String fn, String ln, String ffn, String ssn) {
		super(fn, ln, ffn);
		this.Sname = ssn;
	}

	public void displaySname() {
		System.out.println(this.Sname + this.lastName);
	}

}