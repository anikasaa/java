package two;

public class revision6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// loops
		
		// for (inititalization; conditionCheck; increment/decrement){
		// statement
		//}
		
		
		// print 1 to 3

		for (int i = 1; i <=3; i++) {
			System.out.println(i);
		}
		
		// print 1 t0 5
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i);
		}
		
		// print 1-5 in reverse
		
		for (int i = 5; i>=1; i--) {
			System.out.println(i);
		}
		
		// print 2,4,6,8........20
		
		for (int i = 2; i<=20; i = i+2) {
			System.out.println(i);
		}
		
		// print 50,45,40,35............5
		
		for (int i = 50; i >=5; i=i-5) {
			System.out.println(i);
		}
		
		
		// BREAK WITH FOR
		
		
		
		// print 1 to 5 but break at 3
		
		for (int i = 1; i <=5; i++) {
			if (i==3) {
				break;
			}
			System.out.println(i);
		}
		
		// print 1 to 5 but break at 4
		
		for (int i =1; i <=5; i++) {
			if (i==4) {
				break;
			}
			System.out.println(i);
			
		}
	
	
	
	 // FOR WITH CONTINUE
		
		//print 1 to 5 but break at 3 and continue 
		
		for (int i = 1; i <=5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//WHILE LOOP
		
		//INITIALIZATION;
		// WHILE CONDITION{
		// STATEMENTS;
		// INCREMENT/DECREMENT;
		//}
		
		
		// print hello 3 times
		
		int t1 = 1;
		while (t1 <=3) {
			System.out.println("hello");
			t1++;
			
		}
		
		// print bye 4 times
		
		int t2 = 1;
		while (t2<=4) {
			System.out.println("bye");
			t2++;
		}
		
	   
		// print 1 to 3
		
		int t3 = 1;
		while (t3 <=3) {
			System.out.println(t3);
			t3++;
		}
		
		// print 12345 in reverse...5,4,3,2,1
		
		int t4 = 5;
		while (t4>=1) {
			System.out.println(t4);
			t4--;
		}
		
		// print 2,4,6,8,10.......20
		
		int t5 = 2;
		while (t5 <=20) {
			System.out.println(t5);
			t5=t5+2;
		}
		
		// print 50,45,40,35........5
		
		int t6 = 50;
		while (t6 >=5) {
			System.out.println(t6);
			t6=t6-5;
		}
		
		// WITH BREAK
		
		int t7 = 10;
		while (t7 >=1) {
			if (t6==5) {
				break;
			}
			System.out.println(t7);
			t7--;
		}
		
		// WITH CONTINUE
		// print 1,2, skip 3 and print 4,5 ......1,2,4,5
		
		int t8 = 1;
		while (t8 <=5) {
			if (t8==3) {
				t8++;
				continue;
			}
			System.out.println(t8);
			t8++;
		}

	}

}
