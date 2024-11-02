package com.xworkz.shoping.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class shopingUpdate {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/shopping_details";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuary = "update shoping_table Set item_price='299' where id=1";
		String updateQuary1 = "update shoping_table Set item_price='195' where id=2";
		String updateQuary2 = "update shoping_table Set item_price='150' where id=3";
		String updateQuary3 = "update shoping_table Set item_price='100' where id=4";
		String updateQuary4 = "update shoping_table Set item_price='400' where id=5";
		String updateQuary5 = "update shoping_table Set item_price='450' where id=6";
		String updateQuary6 = "update shoping_table Set item_price='95' where id=7";
		String updateQuary7 = "update shoping_table Set item_price='150' where id=8";
		String updateQuary8 = "update shoping_table Set item_price='120' where id=9";
		String updateQuary9 = "update shoping_table Set item_price='250' where id=10";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(updateQuary);
			int value1 = statement.executeUpdate(updateQuary1);
			int value2 = statement.executeUpdate(updateQuary2);
			int value3 = statement.executeUpdate(updateQuary3);
			int value4 = statement.executeUpdate(updateQuary4);
			int value5 = statement.executeUpdate(updateQuary5);
			int value6 = statement.executeUpdate(updateQuary6);
			int value7 = statement.executeUpdate(updateQuary7);
			int value8 = statement.executeUpdate(updateQuary8);
			int value9 = statement.executeUpdate(updateQuary9);

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
