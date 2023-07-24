package two;

public class revision27bbbaccessingouterclassfieldsintoinnerclass {

	public static void main(String[] args) {

		CarS Toyota = new CarS("Toyota", "SUV");
		CarS Sienna = new CarS("Sienna", "sedane");

		CarS.EngineS T = Toyota.new EngineS();
		CarS.EngineS U = Sienna.new EngineS();

		T.EngineSize();
		U.EngineSize();

	}

}

class CarS {
	String CarName;
	String CarType;

	public CarS(String nm, String tp) {
		this.CarName = nm;
		this.CarType = tp;
	}

	public void Greet() {
		System.out.println("congrats on your new car".concat(CarName));
	}

	// creating innerclass

	class EngineS {
		String EngineSize;

		// accessing the outer class fields into inner class

		public void EngineSize() {
			if (CarS.this.CarType.equals("SUV")) {
				System.out.println("small engine");
			}

			else if (CarS.this.CarType.equals("sedane")) {
				System.out.println("big engine");
			}
		}
	}
}
