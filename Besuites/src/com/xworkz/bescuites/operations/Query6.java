package com.xworkz.bescuites.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.bescuites.constants.BescuitsConst;

public class Query6 {

	public static void main(String[] args) {

		String query6 = "select bescuite_Name FROM bescuites_info WHERE id>5";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query6);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("bescuite_Name"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
