package two;

public class revision5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String city = "indore";
		
		switch (city) {
		case "pune":
			System.out.println("MH");
		
		case "jaipur":
			System.out.println("RJ");
			
		case "bhopal":
			System.out.println("MP");
			
		case "varanasi":
			System.out.println("UP");
			
		default:
			System.out.println("print correct city name");
		}
		
		
		switch (city) {
		
		case "pune":
			System.out.println("MH");
			break;
			
		case "jaipur":
			System.out.println("RJ");
			break;
			
		case "bhopal":
			System.out.println("MP");
			break;
			
		case "varanasi":
			System.out.println("UP");
			break;
			
		default:
			System.out.println("incorrect city name");
		}
		
		
		switch (city) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
			
		case "jaipur":
		case "udaipur":
			System.out.println("RJ");
			break;
			
		case "bhopal":
		case "indore":
			System.out.println("MP");
			break;
			
		case "varanasi":
		case "lucknow":
			System.out.println("UP");
			break;
		default:
			System.out.println("incorrect city name");
		}

	}

}
