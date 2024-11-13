package com.makeupItem.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.makeupItem.constants.ShoppingEnum;

public class ShoppingRunner {

	public static void main(String[] args) {

		// Declare database connection and PreparedStatement
		Connection connection = null;
		PreparedStatement preparstmt = null;

		try {

			connection = DriverManager.getConnection(ShoppingEnum.URL.getValue(), ShoppingEnum.USERNAME.getValue(),
					ShoppingEnum.PASSWORD.getValue());

			preparstmt = connection.prepareStatement("INSERT INTO shopping_info  VALUES (?, ?, ?)");

			preparstmt.setInt(1, 1);
			preparstmt.setString(2, "Kurties");
			preparstmt.setString(3, "500");
			
			preparstmt.setInt(1, 2);
			preparstmt.setString(2, "makeupKit");
			preparstmt.setString(3, "900");

			preparstmt.setInt(1, 3);
			preparstmt.setString(2, "shoes");
			preparstmt.setString(3, "300");
			
			preparstmt.setInt(1, 4);
			preparstmt.setString(2, "Bag");
			preparstmt.setString(3, "400");
			
			preparstmt.setInt(1, 5);
			preparstmt.setString(2, "Sandal");
			preparstmt.setString(3, "250");
			
			preparstmt.setInt(1, 6);
			preparstmt.setString(2, "Smart Phone");
			preparstmt.setString(3, "15000");
			
			preparstmt.setInt(1, 7);
			preparstmt.setString(2, "Jocket");
			preparstmt.setString(3, "300");
			
			preparstmt.setInt(1, 8);
			preparstmt.setString(2, "Jeans");
			preparstmt.setString(3, "800");
			
			preparstmt.setInt(1, 9);
			preparstmt.setString(2, "Tops");
			preparstmt.setString(3, "600");
			
			preparstmt.setInt(1, 10);
			preparstmt.setString(2, "Coconet oil");
			preparstmt.setString(3, "55");
			
			preparstmt.setInt(1, 11);
			preparstmt.setString(2, "Turmeric Power");
			preparstmt.setString(3, "30");
			
			preparstmt.setInt(1, 12);
			preparstmt.setString(2, "Fruits");
			preparstmt.setString(3, "200");
			
			preparstmt.setInt(1, 13);
			preparstmt.setString(2, "Vegetable");
			preparstmt.setString(3, "100");
			
			preparstmt.setInt(1, 14);
			preparstmt.setString(2, "Earrings");
			preparstmt.setString(3, "50");
			
			preparstmt.setInt(1, 15);
			preparstmt.setString(2, "Chocolate");
			preparstmt.setString(3, "150");
			
			int result = preparstmt.executeUpdate();

			// Check if the insertion was successful
			if (result > 0) {
				System.out.println("This shopping info is saved");
			} else {
				System.out.println("This shopping info is not saved");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}


