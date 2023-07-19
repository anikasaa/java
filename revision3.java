package two;

public class revision3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// comparison opoerator
		// <, >, <=, >=, ==, !=
		
		System.out.println(7<8);//true
		System.out.println(5<10);//true
		System.out.println(9==9);//true
		System.out.println(7!=8);//true
		System.out.println(9>8);//true
		System.out.println(7>=7);//true
		System.out.println(7!=7);//false
		
		
		//logical Operators
		// AND --> &&
		
		//TRUE && TRUE ====> TRUE
		//FALSE && TRUE ====> FALSE
		//TRUE && FALSE =====> FALSE
		//FALSE && FALSE ====> FALSE
		
		System.out.println(12==12 && 9==9);//true
		System.out.println(7>9 && 9==9);//false
		System.out.println(12 !=12 && 11==11);//false
		System.out.println(12==12 && 11!=11);//false
		
		
		//OR===> ||
		
		// TRUE || TRUE ====> TRUE
		// FALSE || TRUE ===> TRUE
		// TRUE || FALSE ===> TRUE
		// FALSE || FALSE ===> FALSE
		
		System.out.println(12==12 || 11==11);//true
		System.out.println(10<9 || 9>3);//true
		System.out.println(20==20 || 20!=10);//true
		System.out.println(10<9 || 9<8);//false
		
		
		//NOT ====> !
		
		//TRUE.....FALSE
		//FALSE....TRUE
		
		System.out.println(!(2==2));//false
		System.out.println(2!=2);//false
		
	
		
		

	}

}
