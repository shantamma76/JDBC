package com.makeupItem.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.makeupItem.constants.RestaurantEnum;

public class RestaurantRunner {
	public static void main(String[] args) {
		
		Connection connection=null;
		PreparedStatement prestmt=null;
		
		try {
			connection=DriverManager.getConnection(RestaurantEnum.URL.getValue(),RestaurantEnum.USERNAME.getValue(),RestaurantEnum.PASSWORD.getValue());
			
			prestmt=connection.prepareStatement("INSERT INTO restaurant_food VALUES (?,?,?,?)");
			
			prestmt.setInt(1, 1);
			prestmt.setString(2, "Masala Dosa");
			prestmt.setString(3, "55");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 2);
			prestmt.setString(2, "Itly");
			prestmt.setString(3, "45");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 3);
			prestmt.setString(2, "Wadda");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 4);
			prestmt.setString(2, "Wadda");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 5);
			prestmt.setString(2, "Bireyani");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Non-Veg");
			
			prestmt.setInt(1, 6);
			prestmt.setString(2, "Chicken Tika");
			prestmt.setString(3, "150");
			prestmt.setString(4, "Non-Veg");
			
			prestmt.setInt(1, 7);
			prestmt.setString(2, "Paneer Carry");
			prestmt.setString(3, "100");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 8);
			prestmt.setString(2, "EGG Rice");
			prestmt.setString(3, "90");
			prestmt.setString(4, "Non-Veg");
			
			prestmt.setInt(1, 9);
			prestmt.setString(2, "Cabaab");
			prestmt.setString(3, "180");
			prestmt.setString(4, "Non-Veg");
			
			prestmt.setInt(1, 10);
			prestmt.setString(2, "Puri");
			prestmt.setString(3, "50");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 11);
			prestmt.setString(2, "Masala Rice");
			prestmt.setString(3, "70");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 12);
			prestmt.setString(2, "Curd Rice");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 13);
			prestmt.setString(2, "paddu");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 14);
			prestmt.setString(2, "Pani Puri");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Veg");
			
			prestmt.setInt(1, 15);
			prestmt.setString(2, "Cake");
			prestmt.setString(3, "40");
			prestmt.setString(4, "Junk food");
			
			int value=prestmt.executeUpdate();
			
			if(value>0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
