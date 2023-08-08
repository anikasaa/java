package two;

import java.util.HashMap;
import java.util.Map;

public class day36b {

	public static void main(String[] args) {

		Map<String, String> students = new HashMap<String, String>();

		students.put("firstName", "anisha");
		students.put("lastName", "tuladhar");
		students.put("rollNo", "156");
		students.put("age", "37");

		for (String key : students.keySet()) {
			System.out.println(key);
		}

		for (String values : students.values()) {
			System.out.println(values);
		}

	}

}
