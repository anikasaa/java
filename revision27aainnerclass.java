package two;

public class revision27aainnerclass {

	public static void main(String[] args) {

		CPU1 i9 = new CPU1();
		System.out.println(i9.price);

		int priceD = i9.displayPrice();
		System.out.println(priceD);

		CPU1.Processor pro = i9.new Processor();
		System.out.println(pro.manufacturer);
		System.out.println(pro.speed());

	}

}

class CPU1 {
	int price = 500;

	class Processor {
		String manufacturer = "lenovo1";

		public String speed() {
			return "fast";

		}
	}

	public int displayPrice() {
		return this.price;

	}
}
