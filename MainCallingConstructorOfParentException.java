package two;

class MyException extends Exception {
	public MyException(String s) {

		// call constructor of parent Exception
		super(s);
	}
}

class InvalidMobileNumber extends Exception {
	public InvalidMobileNumber(String s) {

		// call constructor of parent Exception
		super(s);
	}
}

// A class that uses above MyException

public class MainCallingConstructorOfParentException {

	public static void main(String[] args) {
		try {
			String password = "ascdhtnchdufksbdh";
			if (password.length() <= 8) {
				throw new MyException("password length is small");
			}

			String mobile = "qascnfjdo";
			if (mobile.length() <= 10) {
				throw new InvalidMobileNumber("please enter correct mobile");
			}

			System.out.println("user registered");

		}

		catch (Exception e) {
			System.out.println("function called");
			System.out.println("caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
