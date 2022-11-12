package bagelShopApp;

import java.io.File;		//Imports the File class
import java.io.IOException;	// handles errors

public class CreateFile {	// Creates a file

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\JavaTxtFiles\\File1.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}

}
