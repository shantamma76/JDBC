package com.xworkz.foodOrder.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FoodOrderUpdate {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/food_order";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuary1 = "update food_details Set food_name='Masal Dosa' where id=1";
		String updateQuary2 = "update food_details Set food_cost='60' where id=1";
		String updateQuary3 = "update food_details Set food_cost='80' where id=2";
		String updateQuary4 = "update food_details Set food_name='Allu Samosa' where id=3";
		String updateQuary5 = "update food_details Set food_name='Dhahi wadda' where id=5";
		String updateQuary6 = "update food_details Set food_tast='good' where id=6";
		String updateQuary7 = "update food_details Set food_name='Paneer Carry' where id=8";
		String updateQuary8 = "update food_details Set food_cost='100' where id=8";
		String updateQuary9 = "update food_details Set food_cost='40' where id=9";
		String updateQuary10 = "update food_details Set food_cost='35' where id=7";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			Statement statement = connection.createStatement();

			int value1 = statement.executeUpdate(updateQuary1);
			int value2 = statement.executeUpdate(updateQuary2);
			int value3 = statement.executeUpdate(updateQuary3);
			int value4 = statement.executeUpdate(updateQuary4);
			int value5 = statement.executeUpdate(updateQuary5);
			int value6 = statement.executeUpdate(updateQuary6);
			int value7 = statement.executeUpdate(updateQuary7);
			int value8 = statement.executeUpdate(updateQuary8);
			int value9 = statement.executeUpdate(updateQuary9);
			int value10 = statement.executeUpdate(updateQuary10);

			if (value1 > 0) {
				System.out.println("This is saved");
			} else {
				System.out.println("This is not saved");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
