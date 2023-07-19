package two;

public class revision8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "anisha";
		
		// string stores the value by index
		
		//0  1  2  3  4  5
		//A  N  I  S  H  A
		
		//charAt()
		System.out.println(firstName.charAt(2));
		
		// String stores the value by index
		
		//program 1 
		
		// print every character of string using for loop, while loop and forEach loop
		// FOR LOOP
		
		for(int i=0; i <firstName.length(); i++) {
			//System.out.println(i);
			System.out.println(firstName.charAt(i));
		}
		
		//program 2
		//WHILE LOOP
		
		int i=0;
		while (i<firstName.length()) {
			//System.out.println(i);
			System.out.println(firstName.charAt(i));
			i++;
			
		}
		
		// program 3
		// FOREACH LOOP
		
		// "anisha" ====> {"a", "n", "i", "s", "h" "a"}
		for(char cc: firstName.toCharArray()) {
			System.out.println(cc);
		}
		
		
		
		//program 4
		// TOUPPERCASE
		
		String city = "boston";
		String b = city.toUpperCase();
		System.out.println(b);

		
		//program 5
		//TOLOWERCASE
		
		String city1 = "MaLden";
		String b1 = city1.toLowerCase();
		System.out.println(b1);
		
		// program 6
		// TRIM
		
		String city2 = "  medford  ";
		System.out.println(city2.length());
		String b2= city2.trim();
		System.out.println(b2.length());
		
		
		// program 7
		//STARTSWITH
		
		String city3 = "Vermont";
		boolean b3 = city3.startsWith("Ver");
		System.out.println(b3);
		
		
		// program 8
		//ENDSWITH
		
		String city4 = "Burlington";
		boolean b4 = city4.endsWith("ton");
		System.out.println(b4);
		
		
		// program 9 
		// REPLACE
		
		String np = "I am from Nepal and Nepal is beautiful";
		System.out.println(np.replace("I", "w"));
		
		
		//REPLACEALL
		String np2 = np.replaceAll("Nepal", "Boston");
		System.out.println(np2);
		
		
		//REPLACEFIRST
		String np3 = np.replaceFirst("Nepal", "Boston");
		System.out.println(np3);
		
		
		//Program 10
		//CONCAT
		
		
		 String fn1 = "Aarik";
		 String ln1 = "Tuladhar";
		 String fullName = fn1.concat(ln1);
		 System.out.println(fullName);
				 
		 
		 // Program 11
		 //EQUALS
		 
		 String city5 = "Melrose";
		 String city6 = "Melrose";
		 String city7 = "Melrose";
		 
		 boolean ab = city5.equals(city6);
		 System.out.println(ab);
		 
		 // EQUALSIGNORANCECASE
		 
		 boolean ab1 = city5.equalsIgnoreCase(city7);
		 System.out.println(ab1);
		 
		 
		 //CONTAINS
		 
		 System.out.println(city5.contains("Mel"));
		 System.out.println(city5.contains("ose"));
		 
		 
		 //SPLIT
		 
		 String city8 = "my favorite city is boston";
		 String [] ab2 = city8.split("");
		 for(String ab3:ab2) {
			 System.out.println(ab3);
		 }
		 
		 
		 //SUBSTRING(will only print albhabet from the number you have mentioned)
		 
		 String city9 = "kathmandu";
		 
		 //0  1  2  3  4  5  6  7  8
		 //k  a  t  h  m  a  n  d  u
		 
		 String ab4 = city9.substring(2);
		 System.out.println(ab4);
		 
		 String ab5 = city9.substring(4,7);
		 System.out.println(ab5);
		 
		 
		 //program 13
		 // PRINT IN REVERSE
		 
		 String city10 = "pune";
		 String rev = "";
		  for (int i1 = city10.length()-1; i1 >=0; i1--) {
			  rev = rev+city10.charAt(i1);{
				  System.out.println(rev);
			  }
		  }
		 
		 
		 
		 
		 
		 
		
		


	}

}
