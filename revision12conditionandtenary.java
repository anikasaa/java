package two;

public class revision12conditionandtenary {

	public static void main(String[] args) {

		// conditional statement

		int numX = 70;
		if (numX > 0 && numX <= 5) {
			System.out.println("10%discount");
		}

		if (numX > 5 && numX <= 10) {
			System.out.println("20%discount");

		}

		if (numX > 10) {
			System.out.println("30% discount");
		}

		// program 2 (else if)

		int numXa = -20;
		if (numXa > 0 && numXa <= 5) {
			System.out.println("10% discount");
		}

		else if (numXa > 5 && numXa <= 10) {
			System.out.println("20% discount");
		}

		else if (numXa > 10) {
			System.out.println("30% discount");
		} else {
			System.out.println("please put it correct data");
		}

		// program 3 (marks)

		int marks = 100;
		if (marks > 90) {
			System.out.println("grade A");
		}

		if (marks > 75) {
			System.out.println("grade B");

		}

		if (marks > 60) {
			System.out.println("grade C");
		}

		else {
			System.out.println("try again later");
		}

		// program 4

		int t = 10;
		int s = 5;

		if (s > t) {
			System.out.println("s is greater");
		}

		else {
			System.out.println("t is greater");
		}

		int a1 = 10;
		int a2 = 5;
		int a3 = 3;

		if (a1 > a2 && a1 > a3) {
			System.out.println("a1 is greater");
		}

		else if (a2 > a1 && a2 > a3) {
			System.out.println("a2 is greater");
		}

		else {
			System.out.println("a3 is greater");
		}

		// program 5 (Tenary operator)

		int j = 60;
		int k = 300;

		String j2 = j > k ? "j is greater" : "k is greater";
		System.out.println(j2);

	}

}
