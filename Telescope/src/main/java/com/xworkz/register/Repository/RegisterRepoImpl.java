package com.xworkz.register.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.register.constants.RegisterConstant;
import com.xworkz.register.dto.RegisterDTO;

public class RegisterRepoImpl implements RegisterRepo {

	@Override
	public boolean save(RegisterDTO registerDTO) {
		System.out.println("This RegisterRepoImpl ");
		boolean ifSaved = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;
			connection = DriverManager.getConnection(RegisterConstant.URL.getValue(),
					RegisterConstant.USERNAME.getValue(), RegisterConstant.PASSWORD.getValue());
			PreparedStatement preparedState = null;

			preparedState = connection.prepareStatement("INSERT INTO registration_form VALUES(?,?,?,?,?)");

			preparedState.setString(1, registerDTO.getFirstName());
			preparedState.setString(2, registerDTO.getLastName());
			preparedState.setString(3, registerDTO.getEmail());
			preparedState.setString(4, registerDTO.getMobileNo());
			preparedState.setString(5, registerDTO.getAddress());

			int value = preparedState.executeUpdate();

			if (value > 0) {
				System.out.println("This is saved");
				ifSaved = true;
			} else {
				System.out.println("this is not saved");
				ifSaved = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return ifSaved;
	}
}