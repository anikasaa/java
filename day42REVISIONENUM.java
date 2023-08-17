package two;

enum SizeX1 {

	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class TshirtSize {

	SizeX1 Tshirt;

	public TshirtSize(SizeX1 tshirt) {
		this.Tshirt = tshirt;

	}

	public void buyTshirt() {
		switch (Tshirt) {
		case SMALL:
			System.out.println("i am buying a small size");
			break;

		case MEDIUM:
			System.out.println("i am buying a medium size");
			break;

		case LARGE:
			System.out.println("i am buying a large size");
			break;

		case EXTRALARGE:
			System.out.println("i am buying a extralarge size");
			break;

		default:
			System.out.println("please choose a size");
		}
	}

}

public class day42REVISIONENUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TshirtSize x = new TshirtSize(SizeX1.SMALL);
		x.buyTshirt();

	}

}
