package two;

public class revision7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to define a String
		
		// two ways to define array
		
		int [] numbers = new int [3];
		numbers [0] = 11;
		numbers [1] = 12;
		numbers [2] = 13;
		
		int [] numbers2 = {11,22,33};
		 for (int i =0; i <numbers2.length; i++) {
			 System.out.println(numbers2[i]);
		 }
		 
		 int t1 = 0;
		 while (t1 < numbers2.length) {
			 System.out.println(numbers2[t1]);
			 t1=t1+1;
		 }
		 
		 for (int x : numbers2) {
			 System.out.println(x);
		 }
		
	
		 String [] names = new String [2];
		 names [0]= "ram";
		 names [1]= "sham";
		 
		 String [] names2 = {"ram","sham"};
		 
		 for (int i = 0; i < names.length; i++) {
			// System.out.println(i);
			 System.out.println(names[i]);
		 }
		 
		 
		 // while loop
		 
		 int t2 = 0;
		 while (t2< names.length) {
			 System.out.println(names[t2]);
			 t2=t2+1;
		 }
		 // for each loop
		 
		 for (String a1: names) {
			 System.out.println(a1);
		 }
		

	}

}
