package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DBConnect {
	public static void main(String[] args) {

		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "anshi@12");

			String createTable = "CREATE TABLE IF NOT EXISTS patient (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
					+ "name VARCHAR(50), " + "age INT, " + "disease VARCHAR(50), " + "admission_date DATE, "
					+ "doctor_assigned VARCHAR(50))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(createTable);

			Scanner sc = new Scanner(System.in);

			System.out.print("Enter Patient Name: ");
			String name = sc.nextLine();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter Disease: ");
			String disease = sc.nextLine();

			System.out.print("Enter Admission Date (yyyy-mm-dd): ");
			String dateStr = sc.nextLine();

			System.out.print("Enter Doctor Assigned: ");
			String doctor = sc.nextLine();
			System.out.println("Table 'patient' is created.\n");
			
			//>>>>>>>>>>>>INSERT STATEMENT

			String insertSql = "INSERT INTO patient(name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, disease);
			pstmt.setDate(4, Date.valueOf(dateStr));
			pstmt.setString(5, doctor);

			pstmt.executeUpdate();
			System.out.println("Patient record inserted successfully.");
			
			//>>>>>>>>>UPDATE STATEMENT
			System.out.print("\nHow many patients do you want to update? ");
			int updateCount = sc.nextInt();
			sc.nextLine(); 

			String updateSql = "UPDATE patient SET disease = ? WHERE name = ?";
			PreparedStatement updateStmt = con.prepareStatement(updateSql);

			for (int i = 0; i < updateCount; i++) {
			    System.out.println("\n--- Update Patient " + (i + 1) + " ---");

			    System.out.print("Enter Patient Name to update: ");
			    String nameToUpdate = sc.nextLine();

			    System.out.print("Enter New Disease: ");
			    String newDisease = sc.nextLine();

			    updateStmt.setString(1, newDisease);
			    updateStmt.setString(2, nameToUpdate);

			    int rowsAffected = updateStmt.executeUpdate();

			    if (rowsAffected > 0) {
			        System.out.println("Updated: " + nameToUpdate + " → " + newDisease);
			    } else {
			        System.out.println("No patient found with name: " + nameToUpdate);
			    }
			}
    
		//>>>>>>>>>>>DELETE STATEMENT

			String deleteSql = "DELETE FROM patient WHERE name = ?";
			PreparedStatement deleteStmt = con.prepareStatement(deleteSql);
			deleteStmt.setString(1, "Anshita");

			int rowsAffected = deleteStmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Patient deleted successfully.");
			} else {
				System.out.println("No patient found with the given name.");
			}
//
//			String updateSql = "UPDATE patient SET disease = ? WHERE name = ?";
//			PreparedStatement updateStmt = con.prepareStatement(updateSql);
//			updateStmt.setString(1, "Recovered");
//			updateStmt.setString(2, "Anshita");
//			int updateCount = updateStmt.executeUpdate();
//			if (updateCount > 0) {
//				System.out.println("Patient record updated successfully.");
//			} else {
//				System.out.println("No patient found to update.");
//			}

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
