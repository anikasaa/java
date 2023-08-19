package two;

import java.io.FileWriter;
import java.io.IOException;

public class day43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubimport java.io.FileWriter;

		String fileName = "example.txt";

		try {
			FileWriter writer = new FileWriter(fileName);

			// write inot the file

			writer.write("Hello world");
			writer.write("\n");
			writer.write("i am learning java");
			writer.write("\n");
			writer.write("i am learning python");
			writer.write("\n");
			writer.write("i am learning sql");
			writer.write("\n");
			writer.write("i am learning git");
			writer.write("\n");
			writer.close();

			System.out.println("Data has been successfuly written and its now closed");
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
