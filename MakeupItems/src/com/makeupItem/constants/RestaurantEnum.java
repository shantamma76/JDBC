package com.makeupItem.constants;

public enum RestaurantEnum {

	URL("jdbc:mysql://localhost:3306/restaurant"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private RestaurantEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
