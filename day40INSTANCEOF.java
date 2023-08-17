package two;

public class day40INSTANCEOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice inv = new Invoice("123", "anisha", "tuladhar", "12345", "boston");
		System.out.println(inv instanceof Invoice);

	}

}

class Invoice {
	String billNo;
	String firstName;
	String lastName;
	String phoneNo;
	String address;

	public Invoice(String bn, String fn, String ln, String phoneNo, String address) {
		this.billNo = "123";
		this.firstName = "anisha";
		this.lastName = "tuladhar";
		this.phoneNo = "12345";
		this.address = "108WR";

	}
}
