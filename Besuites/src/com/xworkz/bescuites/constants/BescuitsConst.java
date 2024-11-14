package com.xworkz.bescuites.constants;

public enum BescuitsConst {

	URL("jdbc:mysql://localhost:3306/bescuites"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private BescuitsConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
