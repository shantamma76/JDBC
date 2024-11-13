package com.makeupItem.constants;

public enum MakeupEnum {
	
	URL("jdbc:mysql://localhost:3306/makeupitems"), USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private final String value;

	private MakeupEnum(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

}
