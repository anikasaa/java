package two;

interface WBAN {
	public void save();

	public void loan();

}

interface WBIN {
	public void DisplayCountry();

	public void DisplayCity();

}

public class revision26cimplementstwoclasscanbeinheritedinchildclass {

	public static void main(String[] args) {

		BankAa ktm = new BankAa();
		ktm.DisplayCity();
		ktm.DisplayCountry();
		ktm.loan();
		ktm.save();

	}

}

class BankAa implements WBAN, WBIN {

	public void DisplayCountry() {
		System.out.println("this is Nepal");

	}

	public void DisplayCity() {
		System.out.println("this is kathmandu");

	}

	public void save() {
		System.out.println("this is save");

	}

	public void loan() {
		System.out.println("this is loan");

	}

}
