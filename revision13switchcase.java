package two;

public class revision13switchcase {

	public static void main(String[] args) {

		// switch case without statment

		String city = "boston";

		switch (city) {
		case "malden":
			System.out.println("MA");

		case "burlington":
			System.out.println("VT");

		case "edison":
			System.out.println("NJ");

		case "hartford":
			System.out.println("CT");

		default:
			System.out.println("please print correct city name");

		}

		// switch case with break

		switch (city) {
		case "malden":
		case "medford":
			System.out.println("MA");

			break;

		case "burlington":
		case "bethel":
			System.out.println("VT");

			break;

		case "edison":
		case "jersey city":
			System.out.println("NJ");

			break;

		case "hartford":
		case "bristol":
			System.out.println("CT");
			break;

		default:
			System.out.println("incorrect city name");
		}
	}
}