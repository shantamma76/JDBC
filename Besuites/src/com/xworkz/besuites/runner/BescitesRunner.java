package com.xworkz.besuites.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bescuites.constants.BescuitsConst;
import com.xworkz.bescuites.dto.BescuiteDTO;

public class BescitesRunner {

	public static void main(String[] args) {

		BescuiteDTO bescuiteDTO1 = new BescuiteDTO(1, "Parle-G", 10, "soft", "square", "golden-brown", "sweet",
				"06-12-2021", "30-04-2023", "rich");
		BescuiteDTO bescuiteDTO2 = new BescuiteDTO(2, "Sunfeast", 20, "soft", "rectangle", "golden", "sweet",
				"04-04-2022", "09-06-2023", "buttery flavor");
		BescuiteDTO bescuiteDTO3 = new BescuiteDTO(3, "Krackjack", 10, "soft", "square", "golden-brown", "solty",
				"14-11-2022", "11-12-2023", "rich");
		BescuiteDTO bescuiteDTO4 = new BescuiteDTO(4, "Oreo", 30, "flaky", "round", "dark-brown", "sweet", "15-09-2019",
				"12-05-2022", "chacolote");
		BescuiteDTO bescuiteDTO5 = new BescuiteDTO(5, "Marry gold", 20, "soft", "round", "golden", "suger less",
				"06-12-2021", "30-04-2023", "buttery rich");
		BescuiteDTO bescuiteDTO6 = new BescuiteDTO(6, "Monoko", 30, "soft", "round", "light yellow", "solty",
				"02-07-2021", "22-03-202", "flavor");
		BescuiteDTO bescuiteDTO7 = new BescuiteDTO(7, "Moms magic", 30, "flaky", "round", "yellow", "sweet",
				"24-10-2022", "28-08-2023", "rich");
		BescuiteDTO bescuiteDTO8 = new BescuiteDTO(8, "burbun", 20, "tender", "rectangle", "Brown", "sweet",
				"06-12-2021", "30-04-2023", "chacolote");
		BescuiteDTO bescuiteDTO9 = new BescuiteDTO(9, "50-50", 25, "soft", "square", "golden", "solty", "13-06-2022",
				"06-04-2023", "rich");
		BescuiteDTO bescuiteDTO10 = new BescuiteDTO(10, "Good-Day", 10, "soft", "rounda", "yellow", "sweet",
				"16-02-2022", "11-07-2023", "buttery flavor");

		Connection connection = null;
		PreparedStatement prdstatement = null;

		try {
			connection = DriverManager.getConnection(BescuitsConst.URL.getValue(), BescuitsConst.USERNAME.getValue(),
					BescuitsConst.PASSWORD.getValue());
			prdstatement = connection.prepareStatement("INSERT INTO bescuites_info VALUES(?,?,?,?,?,?,?,?,?,?)");

			prdstatement.setInt(1, bescuiteDTO1.getId());
			prdstatement.setString(2, bescuiteDTO1.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO1.getPrice());
			prdstatement.setString(4, bescuiteDTO1.getTexture());
			prdstatement.setString(5, bescuiteDTO1.getShape());
			prdstatement.setString(6, bescuiteDTO1.getColor());
			prdstatement.setString(7, bescuiteDTO1.getTaste());
			prdstatement.setString(8, bescuiteDTO1.getManf_date());
			prdstatement.setString(9, bescuiteDTO1.getExpire_date());
			prdstatement.setString(10, bescuiteDTO1.getFlavour());

			prdstatement.setInt(1, bescuiteDTO2.getId());
			prdstatement.setString(2, bescuiteDTO2.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO2.getPrice());
			prdstatement.setString(4, bescuiteDTO2.getTexture());
			prdstatement.setString(5, bescuiteDTO2.getShape());
			prdstatement.setString(6, bescuiteDTO2.getColor());
			prdstatement.setString(7, bescuiteDTO2.getTaste());
			prdstatement.setString(8, bescuiteDTO2.getManf_date());
			prdstatement.setString(9, bescuiteDTO2.getExpire_date());
			prdstatement.setString(10, bescuiteDTO2.getFlavour());

			prdstatement.setInt(1, bescuiteDTO3.getId());
			prdstatement.setString(2, bescuiteDTO3.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO3.getPrice());
			prdstatement.setString(4, bescuiteDTO3.getTexture());
			prdstatement.setString(5, bescuiteDTO3.getShape());
			prdstatement.setString(6, bescuiteDTO3.getColor());
			prdstatement.setString(7, bescuiteDTO3.getTaste());
			prdstatement.setString(8, bescuiteDTO3.getManf_date());
			prdstatement.setString(9, bescuiteDTO3.getExpire_date());
			prdstatement.setString(10, bescuiteDTO3.getFlavour());

			prdstatement.setInt(1, bescuiteDTO4.getId());
			prdstatement.setString(2, bescuiteDTO4.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO4.getPrice());
			prdstatement.setString(4, bescuiteDTO4.getTexture());
			prdstatement.setString(5, bescuiteDTO4.getShape());
			prdstatement.setString(6, bescuiteDTO4.getColor());
			prdstatement.setString(7, bescuiteDTO4.getTaste());
			prdstatement.setString(8, bescuiteDTO4.getManf_date());
			prdstatement.setString(9, bescuiteDTO4.getExpire_date());
			prdstatement.setString(10, bescuiteDTO4.getFlavour());

			prdstatement.setInt(1, bescuiteDTO5.getId());
			prdstatement.setString(2, bescuiteDTO5.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO5.getPrice());
			prdstatement.setString(4, bescuiteDTO5.getTexture());
			prdstatement.setString(5, bescuiteDTO5.getShape());
			prdstatement.setString(6, bescuiteDTO5.getColor());
			prdstatement.setString(7, bescuiteDTO5.getTaste());
			prdstatement.setString(8, bescuiteDTO5.getManf_date());
			prdstatement.setString(9, bescuiteDTO5.getExpire_date());
			prdstatement.setString(10, bescuiteDTO5.getFlavour());

			prdstatement.setInt(1, bescuiteDTO6.getId());
			prdstatement.setString(2, bescuiteDTO6.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO6.getPrice());
			prdstatement.setString(4, bescuiteDTO6.getTexture());
			prdstatement.setString(5, bescuiteDTO6.getShape());
			prdstatement.setString(6, bescuiteDTO6.getColor());
			prdstatement.setString(7, bescuiteDTO6.getTaste());
			prdstatement.setString(8, bescuiteDTO6.getManf_date());
			prdstatement.setString(9, bescuiteDTO6.getExpire_date());
			prdstatement.setString(10, bescuiteDTO6.getFlavour());

			prdstatement.setInt(1, bescuiteDTO7.getId());
			prdstatement.setString(2, bescuiteDTO7.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO7.getPrice());
			prdstatement.setString(4, bescuiteDTO7.getTexture());
			prdstatement.setString(5, bescuiteDTO7.getShape());
			prdstatement.setString(6, bescuiteDTO7.getColor());
			prdstatement.setString(7, bescuiteDTO7.getTaste());
			prdstatement.setString(8, bescuiteDTO7.getManf_date());
			prdstatement.setString(9, bescuiteDTO7.getExpire_date());
			prdstatement.setString(10, bescuiteDTO7.getFlavour());

			prdstatement.setInt(1, bescuiteDTO8.getId());
			prdstatement.setString(2, bescuiteDTO8.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO8.getPrice());
			prdstatement.setString(4, bescuiteDTO8.getTexture());
			prdstatement.setString(5, bescuiteDTO8.getShape());
			prdstatement.setString(6, bescuiteDTO8.getColor());
			prdstatement.setString(7, bescuiteDTO8.getTaste());
			prdstatement.setString(8, bescuiteDTO8.getManf_date());
			prdstatement.setString(9, bescuiteDTO8.getExpire_date());
			prdstatement.setString(10, bescuiteDTO8.getFlavour());

			prdstatement.setInt(1, bescuiteDTO9.getId());
			prdstatement.setString(2, bescuiteDTO9.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO9.getPrice());
			prdstatement.setString(4, bescuiteDTO9.getTexture());
			prdstatement.setString(5, bescuiteDTO9.getShape());
			prdstatement.setString(6, bescuiteDTO9.getColor());
			prdstatement.setString(7, bescuiteDTO9.getTaste());
			prdstatement.setString(8, bescuiteDTO9.getManf_date());
			prdstatement.setString(9, bescuiteDTO9.getExpire_date());
			prdstatement.setString(10, bescuiteDTO9.getFlavour());

			prdstatement.setInt(1, bescuiteDTO10.getId());
			prdstatement.setString(2, bescuiteDTO10.getBescuite_Name());
			prdstatement.setDouble(3, bescuiteDTO10.getPrice());
			prdstatement.setString(4, bescuiteDTO10.getTexture());
			prdstatement.setString(5, bescuiteDTO10.getShape());
			prdstatement.setString(6, bescuiteDTO10.getColor());
			prdstatement.setString(7, bescuiteDTO10.getTaste());
			prdstatement.setString(8, bescuiteDTO10.getManf_date());
			prdstatement.setString(9, bescuiteDTO10.getExpire_date());
			prdstatement.setString(10, bescuiteDTO10.getFlavour());

			int value = prdstatement.executeUpdate();

			if (value > 0) {
				System.out.println("This is saved");
			} else {
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
