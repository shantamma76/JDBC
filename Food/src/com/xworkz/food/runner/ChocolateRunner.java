package com.xworkz.food.runner;

public class ChocolateRunner {
	public static void main(String[] args) {
		try {
			Class.forName("com.xworkz.food.Chocolate");
			System.out.println("Running  Chocolate in main");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver in ChocolateRunner");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}