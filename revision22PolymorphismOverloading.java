package two;

public class revision22PolymorphismOverloading {

	public static void main(String[] args) {

		additionA(5, 2);
		addition(5, 2, 9);
		addition(5, 2, 9, 1);

	}

	private static void addition(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);

	}

	private static void addition(int i, int j, int k) {
		System.out.println(i + j + k);

	}

	private static void additionA(int i, int j) {
		System.out.println(i + j);

	}

}
