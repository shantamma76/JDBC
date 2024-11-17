package com.xworkz.register.constants;

public enum RegisterConstant {

	URL("jdbc:mysql://localhost:3306/registration"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private RegisterConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
