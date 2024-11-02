package com.xworkz.temple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Temple_info {

	public static void main(String[] args) {

		String url =  "jdbc:mysql://localhost:3306/temple";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuary = "insert into temple_info values(20,'Devi Temple','Devi Nagar klb')";

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
