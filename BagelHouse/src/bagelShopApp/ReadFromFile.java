package bagelShopApp;

import java.io.File;	// imports the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\\\JavaTxtFiles\\\\File1.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();	// must close the reader
		} catch (FileNotFoundException e) {
			System.out.println("An error occured");
		}

	}

}
