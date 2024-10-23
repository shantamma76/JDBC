package com.xworkz.hotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hotel {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/food_order";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection connection=null;
		try {
		connection=DriverManager.getConnection(url,userName,password);
		if(connection!=null)
		{
			System.out.println("this is connected");
		} else {
			System.out.println("this is not connected");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}