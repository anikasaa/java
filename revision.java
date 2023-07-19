package two;

public class revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		// conditional statements
				// one input and multiple outcomes

				// numT > 0 && numT <= 5 --------> 10 % discount
				// numT > 5 && numT <= 10 --------> 20 % discount
				// numT > 10 --------> 30 % discount

//				if(condition) {
//					// statements will be executed
//				}
//				

				// program1

				int numT = 19;

				if (numT > 0 && numT <= 5) {
					System.out.println("10 % discount");
				}
				if (numT > 5 && numT <= 10) {
					System.out.println("20 % discount");
				}
				if (numT > 10) {
					System.out.println("30% discount");
				}

				// program2

				int numTa = -14;

				if (numTa > 0 && numTa <= 5) {
					System.out.println("10 % discount");
				} else if (numTa > 5 && numTa <= 10) {
					System.out.println("20 % discount");
				} else if (numTa > 10) {
					System.out.println("30 % discount");
				} else {
					System.out.println("Incorrect input");
				}

				// program 3

				int marks = 92;

				if (marks > 90) {
					System.out.println("Grade A");
				}
				if (marks > 75) {
					System.out.println("Grade B");
				}
				if (marks > 65) {
					System.out.println("Grade C");
				}

				// program 4

				int marksB = 54;

				if (marksB > 90) {
					System.out.println("Grade A");
				} else if (marksB > 75) {
					System.out.println("Grade B");
				} else if (marksB > 65) {
					System.out.println("Grade C");
				} else {
					System.out.println("Fail try again");
				}

				// program 5

				int a = 10;
				int b = 50;

				if (a > b) {
					System.out.println("a is greater");           
				} else {
					System.out.println("b is greater");
				}

				// program 6

				int x = 10;
				int y = 50;
				int z = 200;

				if (x > y && x > z) {
					System.out.println("x is greater");
				} else if (y > x && y > z) {
					System.out.println("y is greater");
				} else {
					System.out.println("z is greater");
				}

			}

		

	}


