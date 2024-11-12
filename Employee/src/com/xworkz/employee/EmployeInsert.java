package com.xworkz.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeInsert {

	String insertQuery = "INSERT INTO employe_info (id, user_id, F_name, l_name, email_address, phone_number,date_of_birth, registration_date, last_login, is_active, address, city)"
			+ "VALUES"
			+ "(1, 'us17', 'shanta', 'siragan', 'shanta@gmail.com', '95358416', '06-12-2002', '07 mar 2024', '02 nav 2024', 'yes', 'rr nagar', 'Bangalor'), "
			+ "(2, 'us01', 'Renuka', 'Kalaala', 'renu@gmail.com', '447785596', '06-05-2002', '07 oct 2024', '05 nov 2024', 'yes', 'dd nagar', 'Bangalor'), "
			+ "(3, 'us02', 'soujanya', 'bangagry', 'souja@gmail.com', '11223344', '02-05-2002', '05 jan 2024', '06 oct 2024', 'yes', 'jp nagar', 'Bangalor'), "
			+ "(4, 'us03', 'satyabham', 'pimple', 'satya@gmail.com', '225588774', '01-02-2002', '10 mar 2024', '11 oct 2024', 'yes', 'ss nagar', 'pune'), "
			+ "(5, 'us04', 'nikhita', 'chavan', 'nikhi@gmail.com', '15984267', '08-05-2002', '8th april 2024', '25 sep 2024', 'yes', 'kk nagar', 'Bangalor'), "
			+ "(6, 'us05', 'namratha', 'gowda', 'namu@gmail.com', '447785596', '06-05-2003', '7th may 2024', '15 nov 2024', 'yes', 'km nagar', 'Bangalor'), "
			+ "(7, 'us06', 'sangeeta', 'srigeri', 'sangee@gmail.com', '447785596', '06-05-2001', '9th jun 2024', '14 april 2024', 'yes', 'shivaji nagar', 'Bangalor'), "
			+ "(8, 'us07', 'kartik', 'mahesh', 'karti@gmail.com', '447785596', '06-05-1999', '07 dec 2022', '16 aug 2024', 'yes', 'shinti nagar', 'Bangalor'), "
			+ "(9, 'us08', 'vinay', 'gowda', 'vinay@gmail.com', '447785596', '06-05-2000', '07 oct 2024', '18 aug 2024', 'yes', 'viyay nagar', 'Bangalor'), "
			+ "(10, 'us09', 'Siri', 'act', 'siri@gmail.com', '447785596', '06-05-2002', '07 oct 2024', '20 sep 2024', 'yes', 'devi nagar', 'Bangalor'), "
			+ "(11, 'us10', 'Santosh', 'tukaali', 'santu@gmail.com', '6699857', '06-05-2001', '07 oct 2024', '21 oct 2024', 'yes', 'BB nagar', 'Bangalor'), "
			+ "(12, 'us011', 'tanish', 'rao', 'tani@gmail.com', '447785596', '06-05-2002', '07 oct 2024', '05 nov 2024', 'yes', 'dd nagar', 'Bangalor'), "
			+ "(13, 'us012', 'Vijay', 'Devarkonda', 'vijay@gmail.com', '11223344', '02-05-2002', '05 jan 2024', '06 oct 2024', 'yes', 'jp nagar', 'Bangalor'), "
			+ "(14, 'us013', 'Anushka', 'sharma', 'anu@gmail.com', '225588774', '01-02-2002', '10 mar 2024', '11 oct 2024', 'yes', 'ss nagar', 'pune'), "
			+ "(15, 'us014', 'virat', 'kohli', 'kohli@gmail.com', '15984267', '08-05-2002', '8th april 2024', '25 sep 2024', 'yes', 'kk nagar', 'Bangalor'), "
			+ "(16, 'us015', 'Naveen', 'Gowda', 'yash@gmail.com', '447785596', '06-05-2003', '7th may 2024', '15 oct 2024', 'yes', 'km nagar', 'Bangalor'), "
			+ "(17, 'us016', 'Radhika', 'Pandit', 'Radhi@gmail.com', '88556699', '06-05-2001', '9th jun 2024', '14 april 2024', 'yes', 'shivaji nagar', 'Bangalor'), "
			+ "(18, 'us017', 'Yatharva', 'yash', 'yatharva@gmail.com', '99886655', '06-05-1999', '07 dec 2022', '16 aug 2024', 'yes', 'shinti nagar', 'Bangalor'), "
			+ "(19, 'us018', 'Ayra', 'Pandit', 'ayra@gmail.com', '86609535', '06-05-2000', '07 oct 2024', '18 aug 2024', 'yes', 'viyay nagar', 'Bangalor'), "
			+ "(20, 'us019', 'Paarvati', 'patil', 'paru@gmail.com', '35986472', '06-05-2002', '07 oct 2024', '20 sep 2024', 'yes', 'devi nagar', 'Bangalor');";

	public String getInsertQuery() {
		return insertQuery;
		
	}
}
