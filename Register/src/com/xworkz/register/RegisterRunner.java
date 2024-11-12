package com.xworkz.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.register.operator.Query1;
import com.xworkz.register.operator.Query2;
import com.xworkz.register.operator.Query3;
import com.xworkz.register.operator.Query4;
import com.xworkz.register.operator.Query5;
import com.xworkz.register.operator.Query6;
import com.xworkz.registerEnum.ConnectionConst;

public class RegisterRunner {

	public static void main(String[] args) {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(ConnectionConst.URL.getValue(),
					ConnectionConst.USERNAME.getValue(), ConnectionConst.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet1 = statement.executeQuery(new Query1().getQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("Name"));
			}

			System.out.println("--------------------------------");

			ResultSet resultSet2 = statement.executeQuery(new Query2().getQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("Addressl"));
			}

			System.out.println("--------------------------------");

			ResultSet resultSet3 = statement.executeQuery(new Query3().getQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("Email"));
				System.out.println(resultSet3.getString("Password"));
			}

			System.out.println("--------------------------------");

			ResultSet resultSet4 = statement.executeQuery(new Query4().getQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("Email"));
				System.out.println(resultSet4.getString("Password"));
			}

			System.out.println("--------------------------------");

			ResultSet resultSet5 = statement.executeQuery(new Query5().getQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("Name"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet6 = statement.executeQuery(new Query6().getQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet5.getString("Name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
