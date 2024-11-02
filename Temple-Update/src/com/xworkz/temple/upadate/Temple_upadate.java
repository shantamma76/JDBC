package com.xworkz.temple.upadate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Temple_upadate {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/temple";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuary1 = "update temple_info Set temple_name='Iscon Temple' where id='1'";
		String updateQuary2 = "update temple_info Set temple_name='Ram Mandir' where id='2'";
		String updateQuary3 = "update temple_info Set temple_location='chord rd' where id='1'";
		String updateQuary4 = "update temple_info Set temple_location='Lalagiri Cross klb' where id='1'";
		String updateQuary5 = "update temple_info Set temple_name='Sharana basaveshwar' where id='4'";
		String updateQuary6 = "update temple_info Set temple_name='Ambha Bavani Temple' where id='6'";
		String updateQuary7 = "update temple_info Set temple_location='Sajjan Rao Circle' where id='7'";
		String updateQuary8 = "update temple_info Set temple_location='Lakshmanna rd' where id='9'";
		String updateQuary9 = "update temple_info Set temple_name='Satyanarayanna Swamy' where id='9'";
		String updateQuary10 = "update temple_info Set temple_name='Kanaka Parameshwari' where id='10'";

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
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
