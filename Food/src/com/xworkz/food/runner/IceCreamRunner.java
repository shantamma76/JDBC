package com.xworkz.food.runner;

public class IceCreamRunner {
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.xworkz.food.IceCream");
			System.out.println("Running  IceCream in main");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Running Driver in IceCreamRunner");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
	}

}
