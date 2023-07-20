package two;

public class day27b {

	public static void main(String[] args) {
		Car Toyota = new Car("Toyota", "sedane");
		Car Rav4 = new Car("Rav4", "SUV");

		Car.Engine A = Toyota.new Engine();
		Car.Engine B = Rav4.new Engine();

		A.engineSize();
		B.engineSize(); 

	}

}

class Car {
	String CarName;
	String CarType;

	public Car(String nm, String tp) {
		this.CarName = nm;
		this.CarType = tp;

	}

	public void Greet() {
		System.out.println("congrats on your new car".concat(CarName));
	}

	// creating inner class

	class Engine {
		String engineSize;

		// Accessing the outer class fields into inner class

		public void engineSize() {
			if (Car.this.CarType.equals("sedane")) {
				System.out.println("small engine");
			}

			else if (Car.this.CarType.equals("SUV")) {
				System.out.println("big engine");
			}
		}
	}
}
