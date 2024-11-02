package com.xworkz.shoping.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class shopingDelete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/shopping_details";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuary = "delete from shoping_table where item_name='Shoes'";
		String deleteQuary1 = "delete from shoping_table where item_name='Teddy'";
		String deleteQuary2 = "delete from shoping_table where item_name='pizza'";
		String deleteQuary3 = "delete from shoping_table where item_name='sleeper'";
		String deleteQuary4 = "delete from shoping_table where item_name='Burgers'";
		String deleteQuary5 = "delete from shoping_table where item_name='Lamps'";
		String deleteQuary6 = "delete from shoping_table where item_name='ice-cream'";
		String deleteQuary7 = "delete from shoping_table where item_name='Gownn'";
		String deleteQuary8 = "delete from shoping_table where item_name='Jeans'";
		String deleteQuary9 = "delete from shoping_table where item_name='kurties'";
				
				

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(deleteQuary);
			int value1 = statement.executeUpdate(deleteQuary1);
			int value2 = statement.executeUpdate(deleteQuary2);
			int value3 = statement.executeUpdate(deleteQuary3);
			int value4 = statement.executeUpdate(deleteQuary4);
			int value5 = statement.executeUpdate(deleteQuary5);
			int value6 = statement.executeUpdate(deleteQuary6);
			int value7 = statement.executeUpdate(deleteQuary7);
			int value8 = statement.executeUpdate(deleteQuary8);
			int value9 = statement.executeUpdate(deleteQuary9);
			

			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
