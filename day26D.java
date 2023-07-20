package two;

interface Three {
	public void methodThree();

}

interface Four {
	public void methodFour();

}

interface Five {
	public void methodFive();

}

public class day26D {

	public static void main(String[] args) {
		
		Seven ObjSeven = new Seven();
		ObjSeven.SixA();
		ObjSeven.SixB();
		ObjSeven.methodThree();
		ObjSeven.methodFour();

	}

}
        
class Six {
	public void SixA() {
		System.out.println("this is first method for class six");
	}

	public void SixB() {
		System.out.println("this is second method for class six");
	}
}
 
class Seven extends Six implements Three, Four {

	public void methodFour() {
		System.out.println("this is the method from interface four");

	}

	public void methodThree() {
		System.out.println("this is the method from interface three");

	}

}