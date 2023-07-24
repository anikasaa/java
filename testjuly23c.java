package two;

interface WorldbankP {

	public void Save(int q);

	public void Loan(int r);

}

public class testjuly23c {

	public static void main(String[] args) {

		BOAP USA = new BOAP();
		USA.Loan(0);
		USA.Save(0);

		RocklandP boston = new RocklandP();
		boston.Loan(0);
		boston.Save(0);

	}

}

class BOAP implements WorldbankP {

	public void Save(int q) {
		System.out.println("i am save method for BOAP");

	}

	public void Loan(int r) {
		System.out.println("i am loan method for BOAP");

	}

}

class RocklandP implements WorldbankP {

	public void Save(int q) {
		System.out.println("i am save from RocklandP");

	}

	public void Loan(int r) {
		System.out.println("i am loan from RocklandP");

	}

}
