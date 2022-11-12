package bagelShopApp;

import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * The OrderClient class creates the instance of the JFrame to display the GUI
 * for the application.
 */
public class OrderClient <T>extends JFrame { 
	  
	
	private static final long serialVersionUID = 2801484562965510227L;
	private OrderGUI gui; // OrderGUI panel
	private Container c;

	/**
	 * Constructor
	 */
	public OrderClient() {
// Add the OrderGUI panel
		gui = new OrderGUI();
		c = getContentPane();
		c.add(gui);
// Set JFrame parms & then pack
		setTitle("Order Calculator");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) { 
			
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java4_Project", "root","root");
			System.out.println("You are connected to the database successfully!");
			
// *** Here is the delete code, please un-comment to use.***
			
		//	PreparedStatement preparedStatement = connection.prepareStatement("delete from employees where username =?");
			
		//	preparedStatement.setString(1, "Siri");
			
		//	preparedStatement.executeUpdate(); 
			
		//	System.out.println("Data deleted successfully");
			
// *** Here is the update code, please un-comment to use.***
			
		//	PreparedStatement preparedStatement = connection.prepareStatement("update employees set DEPT = ? where ROLLNO=?");

		//	ResultSet resultSet = preparedStatement.executeQuery();
			
		//	while(resultSet.next()) {
		//		String rollno=resultSet.getString("ROLLNO");
		//		String username=resultSet.getString("USERNAME");
		//		String dept=resultSet.getString("DEPT");
				
		//		System.out.println(rollno+" "+username+" "+dept);
		//	}
			
		//	preparedStatement.setString(1, "Regional Manager");
		//	preparedStatement.setString(2, "1");
			
		//	preparedStatement.executeUpdate(); 	
			// If all goes well the database will be updated,
			// If not you will be notified
		//	System.out.println("data updated successfully");
			
// *** Here is the insert code, please un-comment to use.***
			
		// test	PreparedStatement preparedStatement = null;
		//	preparedStatement.setNString(1, "1");
		//	preparedStatement.setNString(2, "Siri");
		//	preparedStatement.setNString(3, "Manager");	
		//	preparedStatement.executeUpdate();
			
		//	System.out.println("Data was inserted successfully.");

		} catch (Exception e) {
			System.out.println("Error while connecting to the database");
		}
		java.util.List<Integer> l = Arrays.asList(5,10,20,30,8,7,12,13);
		l.stream()				// Streams the array
		.filter(x -> x % 2 ==0)	// Lambda removes all un-even numbers from array
		//.filter(x > 10)
		.forEach(System.out::println);
		
/*
 * 
 * This is a sorting and search feature in 
 * a java generic class. Just a simple array is sorted.
 * Then a binary search is performed on the array, and 
 * the element at the index is returned.
 */
		 // Unsorted Array
        int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
  
        // Sorting the array
        Arrays.sort(array);
  
        // Printing sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
  
        // Using binarySearch to search for desired element
        int index = Arrays.binarySearch(array, 0);
  
        // Printing result
        if (index >= 0)
            System.out.println("Element 2 found at index: "
                               + index);
        else
            System.out.println("Element not found");
    

		
		//new OrderClient();
		OrderClient<?> bagelApp = new OrderClient();
		
		}
	

}

