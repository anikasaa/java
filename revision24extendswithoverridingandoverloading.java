package two;

public class revision24extendswithoverridingandoverloading {

	public static void main(String[] args) {

		VehicleV X = new VehicleV("silver", "Ty24", 0210);

		// accessing properties

		System.out.println(X.color);
		System.out.println(X.model);

		// calling out method
		X.displayColor();
		X.displayChaseNoandModel();

		// creating instance of childclass
		CarX toyota = new CarX("silver", "Ty24", 0254, "toyota");
		System.out.println(toyota.color);
		System.out.println(toyota.model);
		System.out.println(toyota.name);

		toyota.displayChaseNoandModel();
		toyota.displayColor();

		// overloading

		toyota.launchDate(2023);
		toyota.launchDate(2023, "september");
		toyota.launchDate(2023, "september", 1);

		toyota.greetMsg();

		int wheels = toyota.displayWheel();
		System.out.println(wheels);

	}

}

class VehicleV {
	String color;
	String model;
	private int chaseNo;

	public VehicleV(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public void displayChaseNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();

	}

	private void displayModelNo() {
		System.out.println(this.model);

	}

	public void greetMsg() {
		System.out.println("welcome to toyota");
	}

	public void greetMsg2() {
		System.out.println("welcome back to toyota");
	}

}

class CarX extends VehicleV {
	String name;
	private int wheel = 4;

	public CarX(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
	}

	// overloading(same class, same method name, different signature)

	public void launchDate(int year) {
		System.out.println(year);
	}

	public void launchDate(int year, String month) {
		System.out.println(year);
		System.out.println(month);
	}

	public void launchDate(int year, String month, int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}

	public int displayWheel() {
		return this.wheel;

	}

	// override(same method, same signature, different class and should be
	// inheritance)

	public void greetMsg() {
		System.out.println("congratulations on your new toyota");
		super.greetMsg();
		this.greetMsg2();
	}

}
