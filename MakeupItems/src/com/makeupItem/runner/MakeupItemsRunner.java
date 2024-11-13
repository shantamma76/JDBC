package com.makeupItem.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.makeupItem.constants.MakeupEnum;

public class MakeupItemsRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(MakeupEnum.URL.getValue(), MakeupEnum.USERNAME.getValue(),
					MakeupEnum.PASSWORD.getValue());

			prst = connection.prepareStatement("INSERT INTO makeup_items VALUES (?, ?, ?)");

			prst.setInt(1, 1);
			prst.setString(2, "lipstick");
			prst.setString(3, "199");

			prst.setInt(1, 2);
			prst.setString(2, "kajal");
			prst.setString(3, "100");

			prst.setInt(1, 3);
			prst.setString(2, "Foudation");
			prst.setString(3, "150");

			prst.setInt(1, 4);
			prst.setString(2, "EyeLiner");
			prst.setString(3, "75");

			prst.setInt(1, 5);
			prst.setString(2, "Mascara");
			prst.setString(3, "180");

			prst.setInt(1, 6);
			prst.setString(2, "Lipliner");
			prst.setString(3, "160");

			prst.setInt(1, 7);
			prst.setString(2, "Powder");
			prst.setString(3, "50");

			prst.setInt(1, 8);
			prst.setString(2, "Rose water");
			prst.setString(3, "55");

			prst.setInt(1, 9);
			prst.setString(2, "NailPolish");
			prst.setString(3, "50");

			prst.setInt(1, 10);
			prst.setString(2, "NailPolish");
			prst.setString(3, "50");
			
			prst.setInt(1, 11);
			prst.setString(2, "Earrings");
			prst.setString(3, "70");
			
			prst.setInt(1, 12);
			prst.setString(2, "Bangals");
			prst.setString(3, "100");
			
			prst.setInt(1, 13);
			prst.setString(2, "Bracelet");
			prst.setString(3, "50");

			prst.setInt(1, 14);
			prst.setString(2, "necklace");
			prst.setString(3, "150");
			
			prst.setInt(1, 15);
			prst.setString(2, "Perfume");
			prst.setString(3, "150");
			
			int value = prst.executeUpdate();
			if (value > 0) {
				System.out.println("This item has been saved.");
			} else {
				System.out.println("This item was not saved.");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
