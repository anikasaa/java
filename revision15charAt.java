package two;

public class revision15charAt {

	public static void main(String[] args) {

		String firstName = "sahara";

		// string stores the value by index
		// 0 1 2 3 4 5
		// s a h a r a

		// charAt()

		System.out.println(firstName.charAt(2));

		// program1
		// print every characterof string using for loop

		for (int i = 0; i < firstName.length(); i++) {
			System.out.println(firstName.charAt(i));
		}
		// while loop

		int i = 0;
		while (i < firstName.length()) {
			System.out.println(firstName.charAt(i));
			i++;

		}

		// for Each loop

		for (char cc : firstName.toCharArray()) {
			System.out.println(cc);
		}

		// to uppercase

		String city = "boston";
		String b = city.toUpperCase();
		System.out.println(b);

	}

	// to lowercase
	String city1 = "WinChEster";
	String b1 = city1.toLowerCase();
	


// TRIM

String city2 = "  medford  ";
private void sysout() {
	// TODO Auto-generated method stub

}
}
