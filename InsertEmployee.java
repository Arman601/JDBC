//write a program to insert a row into employee table
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbc04 {
private static String  url = "jdbc:mysql://localhost:3306/company";
private static String  username = "root";
private static String  password = "9608079847";
private static String Insert_Employee = "insert  into employee(name,salary)" + "values('Rizwan', 120000)";
	public static void main(String[] args) {
		try {
// Step 1: Load JDBC Driver
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Class loaded");

// Step 2: Establish Connection
Connection con = DriverManager.getConnection(url, username, password);
 System.out.println("Connection Established");
 

 // Step 3: Create Statement
   Statement stm = con.createStatement();
   
   
// Step 4: Execute INSERT Query
   int result =  stm.executeUpdate (Insert_Employee);
  System.out.println(result + " row inserted");

		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(SQLException e2) {
			e2.printStackTrace();
		}

	}

}
