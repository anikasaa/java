package two;


public class day33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// singleton pattern

		DatabaseX db3 = DatabaseX.getInsured();
		db3.getConnection();

	}

}

class DatabaseX {
	private static DatabaseX dbO;

	private DatabaseX() {

	}

	public static DatabaseX getInsured() {
		if (dbO == null) {
			dbO = new DatabaseX();
		}

		return dbO;

	}

	public void getConnection() {
		System.out.println("you are now connected to the database");
	}
}









