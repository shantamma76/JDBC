package com.xworkz.foodOrder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Food_Order {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/food_order";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuary = "insert into food_details values(20,'Bhajji','40','Crispy')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuary);

			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}

			if (connection != null) {
				System.out.println("this is connected");
			} else {
				System.out.println("this is not connected");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
