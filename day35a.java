package two;

interface Course {

	public void course1();

	public void course2();

	public void course3();

	public void course4();

	public void course5();

	public void course6();

}

class Math implements Course {

	@Override
	public void course1() {
		System.out.println("Math1");

	}

	@Override
	public void course2() {
		System.out.println("Math2");

	}

	@Override
	public void course3() {
		System.out.println("Math3");

	}

	@Override
	public void course4() {
		System.out.println("Math4");

	}

	@Override
	public void course5() {
		System.out.println("Math5");

	}

	@Override
	public void course6() {
		System.out.println("Math6");

	}

}

class Science implements Course {

	@Override
	public void course1() {
		System.out.println("1");

	}

	@Override
	public void course2() {
		System.out.println("2");

	}

	@Override
	public void course3() {
		System.out.println("3");

	}

	@Override
	public void course4() {
		System.out.println("4");

	}

	@Override
	public void course5() {
		System.out.println("5");

	}

	@Override
	public void course6() {
		System.out.println("6");

	}

}

public class day35a {

	public static void main(String[] args) {

		Course work;
		work = new Math();
		work.course5();

		work = new Science();
		work.course3();

	}

}
