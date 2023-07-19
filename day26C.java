package two;

interface WBA {
	public void Save();

	public void Loan();

}

interface WBI {
	public void DisplayCountry();

	public void DisplayCity();

}

public class day26C {

	public static void main(String[] args) {

		BankA ktm = new BankA();
		ktm.DisplayCity();
		ktm.DisplayCountry();
		ktm.Loan();
		ktm.Save();

	}

}

class BankA implements WBA, WBI {

	public void DisplayCountry() {
		System.out.println("this is Nepal");

	}

	public void DisplayCity() {
		System.out.println("this is Kathmandu");

	}

	public void Save() {
		System.out.println("this is save method");

	}

	public void Loan() {
		System.out.println("this is loan method");

	}

}
