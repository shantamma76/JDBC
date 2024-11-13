package com.makeupItem.constants;

public enum ShoppingEnum {

	URL("jdbc:mysql://localhost:3306/shopping"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ShoppingEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
