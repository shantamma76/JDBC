package com.xworkz.orderForm.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.orderForm.constants.OrderConstant;
import com.xworkz.orderForm.dto.OrderDTO;

public class OrderRepoImpl implements OrderRepo {

	@Override
	public boolean valideAndSave(OrderDTO orderDTO) {
		System.out.println("Running valideAndSave in OrderRepoImpl");
		boolean isValid = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			PreparedStatement preparedState = null;

			connection = DriverManager.getConnection(OrderConstant.URL.getValue(), OrderConstant.USERNAME.getValue(),
					OrderConstant.PASSWORD.getValue());

			preparedState = connection.prepareStatement("INSERT INTO order_details VALUES(?,?,?,?,?,?,?,?)");

			preparedState.setString(1, orderDTO.getName());
			preparedState.setString(2, orderDTO.getEmail());
			preparedState.setString(3, orderDTO.getPhone());
			preparedState.setString(4, orderDTO.getAddress());
			preparedState.setString(5, orderDTO.getCity());
			preparedState.setInt(6, orderDTO.getPincode());
			preparedState.setString(7, orderDTO.getItem());
			preparedState.setInt(8, orderDTO.getQuantity());

			int value = preparedState.executeUpdate();

			if (value > 0) {
				System.out.println("Order saved successfully.");
				isValid = true;
			} else {
				System.out.println("Order not saved.");
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}
}

