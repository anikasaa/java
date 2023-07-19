package two;

interface WorldBankK {
	public void Save(int x);

	public void Loan(int y);

}

public class day26 {

	public static void main(String[] args) {
		
		SBIA India = new SBIA();
		India.Loan(0);
		India.Save(0);
		
		PNBK Punjab = new PNBK();
		Punjab.Loan(0);
		Punjab.Save(0);

	}

}

class SBIA implements WorldBankK {

	public void Save(int x) {
		System.out.println("this is save method for SBIA");

	}

	public void Loan(int y) {
		System.out.println("this is loan method for SBIA");

	}

}

class PNBK implements WorldBankK {

	public void Save(int x) {
		System.out.println("this is save from PNBK");

	}

	public void Loan(int y) {
		System.out.println("this is loan from PNBK");

	}

}
