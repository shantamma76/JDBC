package com.xworkz.bescuites.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bescuites.constants.BescuitsConst;

public class Query4 {

	public static void main(String[] args) {

		String query4 = "select color,flavour FROM bescuites_info WHERE taste='solty'";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query4);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("color"));
				System.out.println(resultSet.getString("flavour"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
