package two;

public class revision4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CONDITIONAL STATEMENT
		
		int numT = 70;
		if(numT > 0 && numT <=5) {
			System.out.println("10% discount");
		}
		
		if (numT >5 && numT <=10) {
			System.out.println("20 % discount");
		}
		
		if (numT >10) {
			System.out.println("30 % discount");
		}
		
		// program 2 (else if)
		
		int numTa = -70;
		if (numTa > 0 && numTa <=5) {
			System.out.println("10 % discout");
		}
		
		else if (numTa > 5 && numTa <=10) {
			System.out.println("20 % discount");
		}
		
		else if (numTa > 10) {
			System.out.println("30 % discount");
		}
		else {
			System.out.println(" please put it correct input");
		}
		
		
		//program 3 (marks)
		
		int marks = 100;
		if (marks >90) {
			System.out.println("Grade A");
			}
		
		if (marks > 75) {
			System.out.println("Grade B");
		}
		
		if (marks >60) {
			System.out.println("Grade C");
		}
		
		else {
			System.out.println("please try again later");
		}
		
		//program 3
		
		int t = 10;
		int s = 5;
		
		if (s>t) {
			System.out.println("s is greater");
			}
		else {
			System.out.println("t is greater");
		}
		
		
		int a1 = 10;
		int a2 = 5;
		int a3 = 3;
		
		if (a1>a2 && a1>a3) {
			System.out.println("a1 is greater");
		}
			else if (a2>a1 && a2>a3) {
				System.out.println("a2 is greater");
				
			}
		
			else {
				System.out.println("a3 is greater");
			}
		
		
		
		// program 4
		
		//TENARY OPERATOR
		 
		int j = 60;
		int k = 300;
		String j2=j>k? "j is greater": "k is greater";
		System.out.println(j2);
		
		
	
		}
		
	

}
