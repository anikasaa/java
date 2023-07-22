package two;

public class day28a {

	public static void main(String[] args) {

		// Database a = new Database(); // constructor is private
		Database db1 = Database.getInsured();
		db1.getConnection();

	}

}

class Database {
	private static Database dbObject;

	private Database() {

	}

	public static Database getInsured() {
		if (dbObject == null) {
			dbObject = new Database();
		}

		// returns you singleton object
		return dbObject;

	}

	public void getConnection() {
		System.out.println("you are connected to database");
	}
}
