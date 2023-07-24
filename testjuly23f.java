package two;

public class testjuly23f {

	public static void main(String[] args) {
		// overriding

		DiscoverM boston = new DiscoverM("USA", "boston");
		boston.loan();
		boston.save();
		boston.displayMessageM();

	}

}

class WorldbankM {
	String country;

	public WorldbankM(String cnt) {
		this.country = cnt;
	}

	public void save() {
		System.out.println("i am a save method");
	}

	public void loan() {
		System.out.println("i am a loan method");
	}

	public void displayMessageM() {
		System.out.println("welcome to the WorldbankM");
	}
}

class CitizensM extends WorldbankM {
	String branchName;

	public CitizensM(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;

	}

	public void save() {
		System.out.println("i am a save method from CitizensM");
	}

	public void loan() {
		System.out.println("i am a loan method from CitizensM");
	}

}

class DiscoverM extends WorldbankM {
	String branchName;

	public DiscoverM(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;

	}

	public void save() {
		System.out.println("i am save method for DiscoverM");
	}

	public void loan() {
		System.out.println("i am loan method for DiscoverM");
	}

}
