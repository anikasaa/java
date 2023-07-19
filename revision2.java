package two;

public class revision2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int x = 10;
	int y = 5;
	
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	
	
	//calling the function
	
	Calculator(12,2);
	Calculator(10,5);
	Calculator(8,4);
	
	
	 addA();
	 addA();
	 addA();
	 
	addB(12,4);
	addB(12,1);
	addB(12,8);
	addB(12,1);
	
	
	int q1 = addC(12,4);
	System.out.println(q1);
	System.out.println(q1+q1);
	System.out.println(q1-4);
	System.out.println(q1 * 0.10);
	

	}
	
	public static void Calculator (int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}

	//function without parameter and without return type
	
	public static void addA () {
		System.out.println(9+9);
	}
 
	
	//function with parameter and without return type
	
	public static void addB(int q, int r) {
		System.out.println(q+r);
	}
	
	
	//function with parameter and with return type
	
	public static int addC(int a, int b) {
		return a+b;
				
	}
	
}