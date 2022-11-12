package bagelShopApp;

import java.io.FileWriter;	// Import the FileWriter class
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\\\JavaTxtFiles\\\\File1.txt");
			myWriter.write("All Java Teacher's get free coffee and bagels at Steve's Bagel House");
			myWriter.close();		// must close writer
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}
}