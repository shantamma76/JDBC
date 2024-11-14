package com.xworkz.bescuites.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bescuites.constants.BescuitsConst;

public class Query3 {
	public static void main(String[] args) {

		String query3 = "select expire_date FROM bescuites_info WHERE bescuite_Name='Parle-G' AND taste='sweet';";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query3);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("expire_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
