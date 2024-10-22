package com.xworkz.food.runner;

public class PanipuriRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.food.Panipuri");
			System.out.println("Running Panipuri in main");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver in PanipuriRunner");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

	}

}
