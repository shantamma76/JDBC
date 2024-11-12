package com.xworkz.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.xworkz.employee.operations.Query1;
import com.xworkz.employee.operations.Query2;
import com.xworkz.employee.operations.Query3;
import com.xworkz.employee.operations.Query4;
import com.xworkz.employee.operations.Query5;
import com.xworkz.employee.operations.Query6;
import com.xworkz.employeeEnum.ConnectionConsts;

public class EmployeRunner {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(ConnectionConsts.URL.getValue(),
					ConnectionConsts.USERNAME.getValue(), ConnectionConsts.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(new EmployeInsert().getInsertQuery());
			if (value > 0) {
				System.out.println("this is saved");
			} else {
				System.out.println("this is not saved");
			}
			ResultSet resultSet1 = statement.executeQuery(new Query1().getQuery1());
			while (resultSet1.next()) {
				System.out.println(resultSet1.getString("F_name"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet2 = statement.executeQuery(new Query2().getQuery2());
			while (resultSet2.next()) {
				System.out.println(resultSet2.getString("address"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet3 = statement.executeQuery(new Query3().getQuery3());
			while (resultSet3.next()) {
				System.out.println(resultSet3.getString("email_address"));
				System.out.println(resultSet3.getString("l_name"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet4 = statement.executeQuery(new Query4().getQuery4());
			while (resultSet4.next()) {
				System.out.println(resultSet4.getString("email_address"));
				System.out.println(resultSet4.getString("l_name"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet5 = statement.executeQuery(new Query5().getQuery5());
			while (resultSet5.next()) {
				System.out.println(resultSet5.getString("F_name"));
			}
			System.out.println("--------------------------------");
			ResultSet resultSet6 = statement.executeQuery(new Query6().getQuery6());
			while (resultSet6.next()) {
				System.out.println(resultSet6.getString("F_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}