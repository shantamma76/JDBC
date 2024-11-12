package com.xworkz.registerEnum;

public enum ConnectionConst {

	URL("jdbc:mysql://localhost:3306/register"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionConst(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
