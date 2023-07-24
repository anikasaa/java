package two;

public class revision25cabstractclasswithconstructor {

	public static void main(String[] args) {

		ToyotaT sienna = new ToyotaT(2);
		System.out.println(sienna.wheel);
		sienna.brake();

	}

}

abstract class VehicleT {
	int wheel;

	public VehicleT(int wh) {
		this.wheel = wh;

	}

	abstract public void brake();

}

class ToyotaT extends VehicleT {

	public ToyotaT(int wh) {
		super(wh);

	}

	public void brake() {
		System.out.println("i am brake for ToyotaT");

	}

}
