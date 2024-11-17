package com.xworkz.orderForm.constants;

public enum OrderConstant {

	URL("jdbc:mysql://localhost:3306/order_form"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private OrderConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}



