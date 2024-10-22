package com.xworkz.food.runner;

public class JaamunRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.food.Jaamun");
			System.out.println("Running jaamun in main");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver in JaamunRunner");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}

	}
}
