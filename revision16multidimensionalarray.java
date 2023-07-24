package two;

public class revision16multidimensionalarray {

	public static void main(String[] args) {
		
		// how to define an array
		//there are two ways to define an array
		//integers
		
		int[]numbers = new int[3];
		numbers[0]=11;
		numbers[1]= 12;
		numbers[2]= 13;
		
		//for loop
		
		int []numbers2 = {11,22,33};
		for (int i=0; i<numbers2.length; i++) {
			System.out.println(numbers2[i]);
			}
		
		//while loop
		
		int t1=0;
		while (t1<numbers2.length) {
			System.out.println(numbers2[t1]);
			t1=t1+1;
			
		}
		
		//for Each loop
		
		for (int x:numbers2) {
			System.out.println(x);
		}
		
		//for string
		
		String[]names = new String [2];
		names[0]= "anisha";
		names[1]= "aarik";
		
		String []names2 = {"anisha","aarik"};
		//for loop
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//while loop
		
		int t2= 0;
		while (t2<names.length) {
			System.out.println(names2[t2]);
			t2=t2+1;
			
		}
		
		//for each loop
		
		for (String a1:names) {
			System.out.println(a1);
			
		}
		
		
		
		
		
		
		

	}

}
