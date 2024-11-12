package com.xworkz.applicationEnum;

public enum ConnectionConst {

	URL("jdbc:mysql://localhost:3306/Application"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
