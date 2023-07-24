package two;

public class testjuly23e {

	public static void main(String[] args) {
		// overloading

		additionN(20, 2);
		additionN(20, 2, 5);
		additionN(20, 2, 5, 1);

	}

	private static void additionN(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);

	}

	private static void additionN(int i, int j, int k) {
		System.out.println(i + j + k);

	}

	private static void additionN(int i, int j) {
		System.out.println(i + j);

	}

}
