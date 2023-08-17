package two;

public class day41REVISIONSINGLETONPATTERN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseX1 db1 = DatabaseX1.getObject();
		db1.connect();
		DatabaseX1.getObject();

	}

}

class DatabaseX1 {

	private static DatabaseX1 obj;

	private DatabaseX1() {

	}

	public static DatabaseX1 getObject() {

		if (obj == null) {
			obj = new DatabaseX1();
		}
		return obj;

	}

	public void connect() {
		System.out.println("you are now connected");
	}
}
