package two;

public class revision9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multi dimensional array
		
		String states [][]= {
				{"boston","malden"},
				{"portsmouth", "concord"},
				{"edison","newark"}
		};
		
		for (int i = 0; i < states.length; i++) {
			String city[] = states [i];
			for (int j = 0; j < city.length; j++) {
				System.out.println(city[j]);
			}
		}

		
		// while loop
		
		int h1 = 0;
		while (h1 < states.length) {
			String ci[]= states[h1];
			int h2 = 0;
			while (h2 < ci.length) {
				System.out.println(ci[h2]);
				h2++;
			}
			h1++;
		}
		
		
		// forEach loop
		
		for ( String []a : states) {
			for (String b:a) {
				System.out.println(b);
			}
		}
		
		
		
	}

}
