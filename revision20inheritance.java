package two;

public class revision20inheritance {

	public static void main(String[] args) {
		// inheritance

		Student Sahara = new Student();
		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);

		Sahara.firstName = "Sahara";
		Sahara.lastName = "tuladhar";
		Sahara.age = 6;

		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);
		Sahara.displayName();

		// creating object for inheritance(teacher)

		Teacher X = new Teacher();
		System.out.println(X.salary);

		X.firstName = "Sahara X";
		X.lastName = "tuladhar X";
		X.age = 26;
		X.salary = 1500;

		System.out.println(X.firstName);
		System.out.println(X.lastName);
		System.out.println(X.age);

		X.displayName();
		X.displaySalary();

	}

}

class Student {
	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacher extends Student {
	int salary;

	public void displaySalary() {
		System.out.println(this.salary);
	}
}
