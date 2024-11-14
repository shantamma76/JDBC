package com.xworkz.bescuites.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.bescuites.constants.BescuitsConst;

public class Query5 {

	public static void main(String[] args) {
		String query5 = "select color,flavour FROM bescuites_info where taste='sweet' AND bescuite_Name='Good-Day'";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query5);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("color"));
				System.out.println(resultSet.getString("flavour"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
