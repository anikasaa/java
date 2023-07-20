package two;

public class day27a {

	public static void main(String[] args) {

		CPU i8 = new CPU();
		System.out.println(i8.price);
		int priceD = i8.displayPrice();
		System.out.println(priceD);

		CPU.Processor pro = i8.new Processor();

		System.out.println(pro.Manufacturer);
		System.out.println(pro.speed());

	}

}

class CPU {

	int price = 120;

	class Processor {
		String Manufacturer = "lenovo";

		public String speed() {
			return "fast";

		}

	}

	public int displayPrice() {
		return this.price;
	}
}