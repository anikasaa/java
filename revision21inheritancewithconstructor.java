package two;

public class revision21inheritancewithconstructor {

	public static void main(String[] args) {

		// single inheritance with constructor

		StudentA AnishaA = new StudentA("Anisha", "tuladhar", 37);

		TeacherA Anisha = new TeacherA("ani", "tula", 47, 2100);

		System.out.println(Anisha.firstName);
		System.out.println(Anisha.lastName);
		System.out.println(Anisha.age);
		System.out.println(Anisha.salary);

		Anisha.displayName();
		Anisha.displaySalary();

	}

}

class StudentA {

	String firstName;
	String lastName;
	int age;

	public StudentA(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherA extends StudentA {
	int salary;

	public TeacherA(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;
	}

	public void displaySalary() {
		System.out.println(this.salary);
	}
}
