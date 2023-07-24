package two;

public class testjuly23d {

	public static void main(String[] args) {
		// innerclass

		Food X = new Food();
		System.out.println(X.price);
		int priceD = X.displayPrice();
		System.out.println(priceD);

		Food.Pizza fast = X.new Pizza();

		System.out.println(fast.Manufacturer);
		System.out.println(fast.type());

	}

}

class Food {
	int price = 200;

	class Pizza {
		String Manufacturer = "dominoes";

		public String type() {
			return "fastfood";
		}

	}

	public int displayPrice() {
		return this.price;
	}

}
