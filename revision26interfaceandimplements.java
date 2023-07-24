package two;

interface WorldbankB {
	public void Save(int x);

	public void Loan(int y);

}

public class revision26interfaceandimplements {

	public static void main(String[] args) {

		BOAX USA = new BOAX();
		USA.Loan(0);
		USA.Save(0);

		RocklandY boston = new RocklandY();
		boston.Loan(0);
		boston.Save(0);

	}

}

class BOAX implements WorldbankB {

	public void Save(int x) {
		System.out.println("this is save method for BOAX");

	}

	public void Loan(int y) {
		System.out.println("this is loan method for BOAX");

	}

}

class RocklandY implements WorldbankB {

	public void Save(int x) {
		System.out.println("this is save method for RocklandY");

	}

	public void Loan(int y) {
		System.out.println("this is loan method for RocklandY");

	}

}
