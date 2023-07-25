package two;

enum Size {

	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Order {

	Size pizzaSize;

	public Order(Size pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderConfirmation() {

		switch (pizzaSize) {

		case SMALL:
			System.out.println("you placed an order for small pizza");
			break;

		case MEDIUM:
			System.out.println("you placed an order for medium pizza");
			break;

		case LARGE:
			System.out.println("you placed an order for large pizza");
			break;

		case EXTRALARGE:
			System.out.println("you placed an order for large pizza");
			break;
		}
	}
}

public class day29b {

	public static void main(String[] args) {

		Order order = new Order(Size.SMALL);
		order.orderConfirmation();

	}

}
