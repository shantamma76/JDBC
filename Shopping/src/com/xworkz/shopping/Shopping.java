package com.xworkz.shopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Shopping {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/shopping_details";
		String userName="root";
		String password="Xworkzodc@123";
		String inserQuary="insert into shoping_table value(20,'Burger','99')";
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,userName,password);
			
			Statement statement=connection.createStatement();
			int value=statement.executeUpdate(inserQuary);
			
			if(value>0) {
				System.out.println("this is saved");
			}else {
				System.out.println("this is not saved");
			}
			
			if(connection!=null)
			{
				System.out.println("this is connected");
			}else {
				System.out.println("this is not connected");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
