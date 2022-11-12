package bagelShopApp;

import java.io.File;	// Imports the File class 

public class FileInformation {

	public static void main(String[] args) {
		File myObj = new File("C:\\\\JavaTxtFiles\\\\File1.txt");
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());	// writes the name
			System.out.println("Absolute path: " + myObj.getAbsolutePath());	// shows the address
			System.out.println("Writable: " + myObj.canWrite());	// returns boolean value true
			System.out.println("Readable: " + myObj.canRead());		// returns boolean value true because it is
			System.out.println("File size in bytes " + myObj.length());		// to show if it is empty or not, 0 is empty
		} else {
			System.out.println("The file does not exist.");
		}

	}
}
