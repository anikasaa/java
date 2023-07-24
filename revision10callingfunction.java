package two;

public class revision10callingfunction {

	public static void main(String[] args) {

		// calling functions(calculator)

		int x = 10;
		int y = 5;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		// calling function
		Calculator(20, 2);
		calculator(10, 5);

		addA();
		addA();
		addA();

		addB(12, 3);
		addB(4, 6);
		addB(5, 7);
		addB(10, 6);

	}

	private static void calculator(int i, int j) {
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);

	}

	private static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	// function without parameter and wihout return type

	public static void addA() {
		System.out.println(10 + 10);

	}

	// calling with parameter and without return type

	private static void addB(int s, int t) {
		System.out.println(s + t);

	}

	// function with parameter and with return type

	private static int addC(int a, int b) {
		return a + b;

	}

}
