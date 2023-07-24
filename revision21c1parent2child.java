package two;

public class revision21c1parent2child {

	public static void main(String[] args) {
		// one parent 2 child inheritance

		DaughterA sahara = new DaughterA("nirajan", "tuladhar", "sahara");
		SonA aarik = new SonA("nirajan", "tuladhar", "aarik");

		aarik.displaySName();
		aarik.displayName();

		sahara.displayDname();
		sahara.displayName();

	}

}

class FatherA {

	String firstName;
	String lastName;

	public FatherA(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;

	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonA extends FatherA {

	String Sname;

	public SonA(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;

	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}

}

class DaughterA extends FatherA {

	String Dname;

	public DaughterA(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname = dn;

	}

	public void displayDname() {
		System.out.println(this.Dname + this.lastName);

	}

}
