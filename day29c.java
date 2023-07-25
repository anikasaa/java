package two;

enum SizeS {

	SMALL, MEDIUM, LARGE, EXTRALARGE;

	public int getSize() {
		switch (this) {

		case SMALL:
			return 5;

		case MEDIUM:
			return 8;

		case LARGE:
			return 10;

		case EXTRALARGE:
			return 12;

		default:
			return 0;
		}
	}
}

public class day29c {

	public static void main(String[] args) {

		int order = SizeS.MEDIUM.getSize();
		System.out.println(order);

	}

}
