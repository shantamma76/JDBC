package com.xworkz.register.constants;

public enum RegistrationConnection {
	
	URL("jdbc:mysql://localhost:3306/smartPhone"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private RegistrationConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
