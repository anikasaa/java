package two;

import java.util.HashMap;
import java.util.Map;

public class day35b {

	public static void main(String[] args) {

		Map<String, String> course = new HashMap<String, String>();

		course.put("course", "maths");
		course.put("course2", "english");
		course.put("course3", "science");
		course.put("course4", "history");
		course.put("course5", "literature");
		System.out.println(course);

		for (Map.Entry<String, String> entry : course.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}

		// program 2

		Map<String, String> students = new HashMap<String, String>();

		students.put("firstName", "anisha");
		students.put("lastName", "tuladhar");
		students.put("rollNo", "29");
		students.put("age", "37");
		students.put("skills", "art");

		for (String key : students.keySet()) {
			System.out.println(key);
		}

		for (String key : students.values()) {
			System.out.println(key);
		}

		Map<String, String> vehicle = new HashMap<String, String>();

		vehicle.put("color", "blue");
		vehicle.put("type", "SUV");
		vehicle.put("company", "tesla");

		System.out.println(vehicle);

		System.out.println(vehicle.get("color"));
		for (String key : vehicle.keySet()) {
			System.out.println(key);
			System.out.println(vehicle.get(key));
		}

		// with Iterator

		for (Map.Entry<String, String> set : vehicle.entrySet()) {
			System.out.println(set.getKey() + set.getValue());
		}

	}

}
