package com.xworkz.temple.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TempleDelete {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/temple";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuary1 = "delete from temple_info where id='20'";
		String deleteQuary2 = "delete from temple_info where id='19'";
		String deleteQuary3 = "delete from temple_info where id='18'";
		String deleteQuary4 = "delete from temple_info where id='17'";
		String deleteQuary5 = "delete from temple_info where id='16'";
		String deleteQuary6 = "delete from temple_info where id='15'";
		String deleteQuary7 = "delete from temple_info where id='14'";
		String deleteQuary8 = "delete from temple_info where id='13'";
		String deleteQuary9 = "delete from temple_info where id='12'";
		String deleteQuary10 = "delete from temple_info where id='11'";
		
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			int value1 = statement.executeUpdate(deleteQuary1);
			int value2 = statement.executeUpdate(deleteQuary2);
			int value3 = statement.executeUpdate(deleteQuary3);
			int value4 = statement.executeUpdate(deleteQuary4);
			int value5 = statement.executeUpdate(deleteQuary5);
			int value6 = statement.executeUpdate(deleteQuary6);
			int value7 = statement.executeUpdate(deleteQuary7);
			int value8 = statement.executeUpdate(deleteQuary8);
			int value9 = statement.executeUpdate(deleteQuary9);
			int value10 = statement.executeUpdate(deleteQuary10);

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


