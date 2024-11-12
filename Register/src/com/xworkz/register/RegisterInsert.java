package com.xworkz.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterInsert {

		String insertQuery = "insert into register_info (id, Name, Email, Password, Phone, Age, Addressl,DOB, Genger, City, State, Country) "
				+ "values "
				+ "(1, 'shanta', 'shanta@gmail.com', 'shant123', '123456', '22', 'Rajaji Nagar', '06-12-2002', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(2, 'naveen', 'naveen@gmail.com', 'navee123', '866332', '38', 'Vasanth Nagar', '08-01-1986', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(3, 'Radhika', 'radhi@gmail.com', 'radhe123', '77788866', '40', 'Maleshwaram', '07-03-1984', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(4, 'Ananya', 'anu@gmail.com', 'anu123', '1598426', '25', 'Shanti Nagar', '06-03-2002', 'female', 'Bangalore', 'Karnataka', 'India'), "
				+ "(5, 'Santu', 'santu@gmail.com', 'santu', '1235846', '26', 'Jalahalli cross', '30-01-1995', 'male', 'Bangalore', 'Karnataka', 'India'), "
				+ "(6, 'Chanchala', 'chanchu@gmail.com', 'chanchu', '998877445', '21', 'RR Nagar', '12-02-1999', 'female', 'Bangalore', 'Karnataka', 'India'), "
				+ "(7, 'Rahul', 'rahu@gmail.com', 'rahul159', '8855223366', '24', 'Mahalaxmi Layout', '24-10-2002', 'male', 'Bangalore', 'Karnataka', 'India'), "
				+ "(8, 'Nandini', 'nandu@gmail.com', 'nandini258', '8855223364', '22', 'Sujata theater', '14-05-1998', 'female', 'Bangalore', 'Karnataka', 'India'), "
				+ "(9, 'Vencky', 'venky@gmail.com', 'venky123', '147852369', '26', 'Peenya', '16-04-2003', 'male', 'bangalore', 'Karnataka', 'India'), "
				+ "(10, 'Divya', 'divya@gmail.com', 'divya77', '953586609', '27', 'chickpete', '09-06-2001', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(11, 'Ramachari', 'rama@gmail.com', 'ramachari88', '866093535', '29', 'Vijay Nagar', '20-11-1998', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(12, 'Reena', 'reena@gmail.com', 'reena48', '987456121', '25', 'Banerighatta', '23-09-2003', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(13, 'Nakul', 'nakul@gmail.com', 'nakul33', '8899774455', '24', 'JP Nagar', '26-05-1998', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(14, 'Pretham', 'pretham@gmail.com', 'pretham186', '8877996655', '25', 'Indira nagar', '21-02-1999', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(15, 'Arjun', 'arjun@gmail.com', 'arjun23', '8899557744', '21', 'Pete arear', '19-04-2003', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(16, 'Shivaraj', 'shiv@gmail.com', 'shiv306', '866019535', '29', 'Electronic City', '30-04-1995', 'male', 'Bangalor', 'Karnataka', 'India'), "
				+ "(17, 'Shantala', 'shanta@gmail.com', 'shanthu630', '9535886609', '23', 'Rajaji Nagar', '06-12-2002', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(18, 'Krishna', 'krish@gmail.com', 'krish159', '866953547', '25', 'Indira nagar', '04-04-2002', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(19, 'Shakunatale', 'shanku@gmail.com', 'shanku94', '866953547', '23', 'Shivajinagar', '04-04-2002', 'female', 'Bangalor', 'Karnataka', 'India'), "
				+ "(20, 'Raju', 'raj@gmail.com', 'raj94', '8866445577', '30', 'Banashankari rd', '09-06-1994', 'male', 'Bangalor', 'Karnataka', 'India');";
		
		public String getInsertQuery() {
			return insertQuery;
		}
}
