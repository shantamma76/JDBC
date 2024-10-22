package com.xworkz.food.runner;

import com.xworkz.food.Dosa;

public class DosaRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.food.boot.dosa.Dosa");
			System.out.println("Running  Chocolate in main");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver in DosaRunner");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}