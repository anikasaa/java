package two;

public class revision23cprotectedandextends {

	public static void main(String[] args) {
		Cars c = new Cars(2023);
		System.out.println(c.year);

		Tesla T = new Tesla(2021);
		T.displayyear();

	}

}

class Cars {
	protected int year;

	public Cars(int yr) {
		this.year = yr;

	}
}

class Tesla extends Cars {

	public Tesla(int yr) {
		super(yr);

	}

	public void displayyear() {
		System.out.println(this.year);
	}

}
