package two;

public class revision19constructor {

	public static void main(String[] args) {

		Vehicle T = new Vehicle();
		Vehicle Toyota = new Vehicle("toyota");
		Vehicle Honda = new Vehicle("honda", "HD2");

	}

}

class Vehicle {
	String name;
	String model;

	public Vehicle() {
		System.out.println("constructor is called");
	}

	public Vehicle(String nm) {
		this.name = nm;
		System.out.println("the name of the vehicle" + this.name);
	}

	public Vehicle(String nm, String md) {
		this.name = nm;
		System.out.println("the name of the vehicle" + this.name + this.model);
	}
}
