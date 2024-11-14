package com.xworkz.bescuites.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bescuites.constants.BescuitsConst;

public class Quert1 {

	public static void main(String[] args) {

		String query1 = "select*from bescuites_info";

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query1);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "," + resultSet.getString("bescuite_Name") + ","
						+ resultSet.getDouble("price") + "," + resultSet.getString("texture") + ","
						+ resultSet.getString("shape") + "," + resultSet.getString("color") + ","
						+ resultSet.getString("taste") + "," + resultSet.getString("manf_date") + ","
						+ resultSet.getString("expire_date") + "," + resultSet.getString("flavour"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
