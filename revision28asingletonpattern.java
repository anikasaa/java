package two;

public class revision28asingletonpattern {

	public static void main(String[] args) {
		Database db1 = Database.getInsured();
		db1.getConnection();

	}

}

class DatabaseR {
	private static DatabaseR dbObject;

	private DatabaseR() {

	}

	public static DatabaseR getInsured() {
		if (dbObject == null) {
			dbObject = new DatabaseR();

		}
		// returns singleton object
		return dbObject;

	}

	public void getConnection() {
		System.out.println("your connection is secured");
	}
}
