package two;

public class day30 {

	public static void main(String[] args) {

		// program 1(without exception)

		// System.out.println("anisha");
		// System.out.println(6/0);
		// System.out.println("sahara");

		// program 2(with exception)

//		System.out.println("anisha");

//		try {
//			int dividebyZero = 6/0;
//			System.out.println("see code in try block");
//			
//		}
//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("sahara");

		// program 3

//		System.out.println("defining array with values");
//		int[] numbers = {10,20,30,40};

//		try {
//			System.out.println(numbers [0]);
//			System.out.println(numbers [5]);

//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());

//		}

//		System.out.println("moving forward after managing exception");

		// program 4

//		System.out.println("define an array with values");
//		int [] numbers1 = {10,20,30,40};

//		try {

//			System.out.println(numbers1[0]);

//			System.out.println(numbers1[5]);

//			System.out.println(6/0);

//		}

//		catch (ArithmeticException e) {
//			System.out.println("please enter valid input");
//			System.out.println(e.getMessage());
//		}

//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("please enter valid index for array");
//			System.out.println(e.getMessage());
//		}
//		catch (Exception e) {
//			System.out.println("exception handled successfully");
//		}
//		System.out.println("moving ahead after managing exception");

		// program 5

		System.out.println("anisha");

		try {
			System.out.println(6 / 0);
		}

		catch (Exception e) {
			System.out.println("exception managed successfully");
			String msg = e.getMessage();
			System.out.println(msg);

		}

		finally {
			System.out.println("it will be executed anyhow");
		}

	}

}
